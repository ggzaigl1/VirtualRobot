package com.lilosoft.virtualrobot.fragment;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.media.FaceDetector;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ProgressBar;

import com.google.gson.Gson;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.lilosoft.virtualrobot.Constant;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.activity.MainActivity;
import com.lilosoft.virtualrobot.base.BaseFragment;
import com.lilosoft.virtualrobot.bean.FaceInfoBean;
import com.lilosoft.virtualrobot.net.ApiService;
import com.lilosoft.virtualrobot.utils.CameraUtils;
import com.lilosoft.virtualrobot.utils.FaceDetectorUtils;
import com.lilosoft.virtualrobot.utils.ImageUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import butterknife.BindView;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * 初始化 人脸识别
 */
public class IntroduceFragment extends BaseFragment implements SurfaceHolder.Callback, Camera.PreviewCallback, View.OnClickListener {

    /**
     * 预览时Frame的计数器
     */
    private int frameCount;

    /**
     * 是否正在检测人脸
     */
    private boolean isDetectingFace = false;

    /**
     * 是否已检测到人脸
     */
    private boolean detectedFace = false;
    private static final int MESSAGE_LOAD = 1;
    private static final String TAG = "IntroduceFragment";

    @BindView(R.id.surfaceview)
    SurfaceView mSurfaceView;
    @BindView(R.id.progress)
    ProgressBar mProgressBar;

    @Override
    public void init(Bundle savedInstanceState, View view) {
//        SurfaceHolder surfaceHolder = mSurfaceView.getHolder();
//        surfaceHolder.addCallback(this);
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_introduce;
    }


    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        CameraUtils.openFrontalCamera(CameraUtils.DESIRED_PREVIEW_FPS, surfaceHolder);
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
        CameraUtils.startPreviewDisplay(surfaceHolder);
        CameraUtils.actionDetect(this);
        frameCount = 0;
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        CameraUtils.releaseCamera();
    }

    @Override
    public void onPreviewFrame(byte[] bytes, Camera camera) {
        Log.e(TAG, "onPreviewFrame...");
        frameCount++;
        detectedFace = false;
        if (frameCount > 15 && !isDetectingFace && !detectedFace) {
            Camera.Size size = camera.getParameters().getPreviewSize();
            final byte[] byteArray = ImageUtils.yuv2Jpeg(bytes, size.width, size.height);
            isDetectingFace = true;
            new Thread() {
                @Override
                public void run() {
                    detectFaces(byteArray);
                }
            }.start();
        }
//        Bitmap bitmap = decodeToBitMap(bytes, camera);
//        findFace(bitmap);
    }


    /**
     * 检测data数据中是否有人脸，这里需要先旋转一下图片，该方法执行在子线程中
     *
     * @param data
     */
    private void detectFaces(byte[] data) {
        Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length);
        bitmap = ImageUtils.rotateBitmap(bitmap, -90);
        bitmap = bitmap.copy(Bitmap.Config.RGB_565, true);
        FaceDetectorUtils.detectFace(bitmap, new FaceDetectorUtils.Callback() {
            @Override
            public void onFaceDetected(final FaceDetector.Face[] faces, final Bitmap bm) {
                isDetectingFace = false;
                Log.e(TAG, "当前图片人脸个数：" + faces.length);
                if (!detectedFace) {
                    detectedFace = true;
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
//                            CameraUtils.stopPreview();
                            String image_base64 = CameraUtils.bitmapToBase64(bm);
//                            getRobotFaceInfo(image_base64);
                            Log.e(TAG, "onFaceDetected: " + image_base64);
                        }
                    });
                }
            }

            @Override
            public void onFaceNotDetected(Bitmap bm) {
                bm.recycle();
                isDetectingFace = false;
            }
        });
    }

    @SuppressLint("HandlerLeak")
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case MESSAGE_LOAD:
                    break;
            }
        }
    };

    public void getRobotFaceInfo(String image_base64) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.RobotURL)
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("access_token", Constant.getToken());
        paramMap.put("enterprise_code", Constant.getEnterpriseCode());
        paramMap.put("image_base64", image_base64);
        paramMap.put("service_id", Constant.serviceId);
        Call<ResponseBody> call = apiService.robotFaceInfo(paramMap);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBody> call, @NonNull retrofit2.Response<ResponseBody> response) {
                try {
                    String jsonVal = response.body().string();
                    FaceInfoBean faceInfoBean = new Gson().fromJson(jsonVal, FaceInfoBean.class);
                    if (faceInfoBean.isSuccess()) {
//                        ((MainActivity) Objects.requireNonNull(getActivity())).showCharFragmentWithName(faceInfoBean.getObj().getId());
                        Log.e(TAG, faceInfoBean.getObj().getId());
//                    ((MainActivity) getActivity()).showSNDH("", "", "");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(@NonNull Call<ResponseBody> call, Throwable t) {
                Log.e("eee", "Throwable---->" + t.getMessage());
            }
        });
    }


    @OnClick({R.id.rl_center})
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_center:
                break;
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        CameraUtils.releaseCamera();
    }

    @Override
    public void onVolumeChanged(int i, byte[] bytes) {

    }

    @Override
    public void onBeginOfSpeech() {

    }

    @Override
    public void onEndOfSpeech() {

    }

    @Override
    public void onResult(RecognizerResult recognizerResult, boolean b) {

    }

    @Override
    public void onError(SpeechError speechError) {

    }

    @Override
    public void onEvent(int i, int i1, int i2, Bundle bundle) {

    }
}


//    private Bitmap decodeToBitMap(byte[] bytes, Camera camera) {
//        Camera.Size size = camera.getParameters().getPreviewSize();
//        YuvImage image = new YuvImage(bytes, ImageFormat.NV21, size.width, size.height, null);
//        ByteArrayOutputStream stream = new ByteArrayOutputStream();
//        image.compressToJpeg(new Rect(0, 0, size.width, size.height), 80, stream);
//        Bitmap bmp = BitmapFactory.decodeByteArray(stream.toByteArray(), 0, stream.size());
//        Matrix matrix = new Matrix();
////        matrix.postRotate(180.0F);
//        matrix.reset();
//        matrix.setRotate(-90);
//        bmp = Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), bmp.getHeight(), matrix, true);
//        Bitmap bitmap = bmp.copy(Bitmap.Config.RGB_565, true);
//        try {
//            stream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return bitmap;
//    }
//
//    public void findFace(Bitmap bitmap) {
//        FaceDetectorUtils.detectFace(bitmap, new FaceDetectorUtils.Callback() {
//            @Override
//            public void onFaceDetected(FaceDetector.Face[] faces, Bitmap bitmap) {
//                Log.e(TAG, "findFace: " + bitmap.toString());
//                if (!isDetectingFace) {
//                    String image_base64 = CameraUtils.bitmapToBase64(bitmap);
//                    getRobotFaceInfo(image_base64);
//                    Log.e(TAG, "onFaceDetected: " + image_base64);
//                    CameraUtils.stopPreview();
//                    isDetectingFace = true;
//                }
//            }
//
//            @Override
//            public void onFaceNotDetected(Bitmap bitmap) {
//                bitmap.recycle();
//                Log.e(TAG, "onFaceNotDetected: " + bitmap);
//            }
//        });
//    }