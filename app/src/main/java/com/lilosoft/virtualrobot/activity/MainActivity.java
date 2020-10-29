package com.lilosoft.virtualrobot.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.media.FaceDetector;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.faceunity.AnimationStateListener;
import com.faceunity.FUStaEngine;
import com.faceunity.sta.OnMediaPlayListener;
import com.faceunity.ui.GLTextureView;
import com.google.gson.Gson;
import com.lilosoft.virtualrobot.Constant;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.adapter.WebBannerAdapter;
import com.lilosoft.virtualrobot.base.BaseActivity;
import com.lilosoft.virtualrobot.bean.FaceInfoBean;
import com.lilosoft.virtualrobot.bean.TokenBean;
import com.lilosoft.virtualrobot.entity.Effect;
import com.lilosoft.virtualrobot.fragment.ChatFragment;
import com.lilosoft.virtualrobot.fragment.IntroduceFragment;
import com.lilosoft.virtualrobot.fragment.MaterialFragment;
import com.lilosoft.virtualrobot.fragment.WebFragment;
import com.lilosoft.virtualrobot.net.ApiService;
import com.lilosoft.virtualrobot.net.result.RetrofitRequest;
import com.lilosoft.virtualrobot.utils.ActivityManageUtil;
import com.lilosoft.virtualrobot.utils.CameraUtils;
import com.lilosoft.virtualrobot.utils.CommonUtil;
import com.lilosoft.virtualrobot.utils.EffectFactory;
import com.lilosoft.virtualrobot.utils.FaceDetectorUtils;
import com.lilosoft.virtualrobot.utils.ImageUtils;
import com.lilosoft.virtualrobot.utils.StaUnityUtils;
import com.lilosoft.virtualrobot.utils.SwitchUtils;
import com.lilosoft.virtualrobot.widget.layoutmanager.BannerLayout;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import pl.droidsonroids.gif.GifDrawable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

import static com.lilosoft.virtualrobot.utils.CameraUtils.bitmapToBase64;

//人脸识别 语音识别到对应的关键词 弹出webview
//Fragment 识别
public class MainActivity extends BaseActivity implements SurfaceHolder.Callback, Camera.PreviewCallback {

    private static final String TAG = "MainActivity";
    private Fragment introduceFragment;//默认页
    private Fragment webFragment;//网页
    private Fragment chatFragment;//聊天页
    private Fragment materialFragment;
    private GifDrawable mGifFromAssets;
    private int face_detectionNum = 0;
    private static final int MESSAGE_LOAD = 1;
    private static final int BASE_ANIMATION_ACTION_SELECTED = 2;
    private static final int BASE_ACTION_SELECTED = 3;
    private static final int BASE_ACTION_NO = 4;
    protected FUStaEngine mFuStaEngine;

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
    private boolean isDetectedFace = false;
    private boolean isFaceIce = false;

    @BindView(R.id.fl_webView)
    public FrameLayout mFrameLayoutWebView;
    @BindView(R.id.fl_chat)
    FrameLayout mFrameLayoutChat;
    @BindView(R.id.recycler_ver)
    public BannerLayout mBannerLayout;
    @BindView(R.id.iv_bg)
    ImageView mImageView;
    @BindView(R.id.iv_logo)
    ImageView mIv_logo;
    @BindView(R.id.tv_title)
    TextView mTV_title;
    @BindView(R.id.tv_title_num)
    TextView mTV_title_num;
    @BindView(R.id.surfaceview)
    SurfaceView mSurfaceView;
    @BindView(R.id.progress)
    ProgressBar mProgressBar;
    @BindView(R.id.gl_surface)
    GLTextureView mGlTextureView;


    @Override
    public int getContentViewResId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        mFuStaEngine = StaUnityUtils.getInstance().getFUStaEngine();
        initAnimationManager(mGlTextureView);
        mGlTextureView.setOpaque(false);
        StartSurfaceView();
        BannerView();
//        ActivityManageUtil.getInstance().startActivityTimer();
//        showWake();
        String logoImgUrl = getIntent().getStringExtra("logoImgUrl");
        String logoName = getIntent().getStringExtra("logoName");
        Glide.with(this).load(logoImgUrl).into(mIv_logo);
        Glide.with(this).load(Constant.getBackImgUrl()).into(mImageView);
        mTV_title.setText(logoName);
        mIv_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    protected void initAnimationManager(GLTextureView glTextureView) {
        mFuStaEngine.onCreate(glTextureView);
        mFuStaEngine.setOnMediaPlayListener(new OnMediaPlayListener() {
            @Override
            public void onPrepared() {
            }

            @Override
            public void onCompleted() {
            }

            @Override
            public void onCancled() {
            }

            @Override
            public void onError(String message) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                    }
                });
            }
        });
        mFuStaEngine.setResolutionScale(1);
        ArrayList<Effect> animEffects = EffectFactory.getEffectList();
        mFuStaEngine.selectEffect(SwitchUtils.convertEffect(animEffects.get(0)));
//        mHandler.sendEmptyMessageDelayed(BASE_ACTION_SELECTED,2000);
    }

    private void StartSurfaceView() {
        SurfaceHolder surfaceHolder = mSurfaceView.getHolder();
        surfaceHolder.addCallback(this);
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
        Log.d(TAG, "onPreviewFrame...");
        frameCount++;
        detectedFace = false;
        if (frameCount > 15 && !isDetectingFace && !detectedFace) {
            Camera.Size size = camera.getParameters().getPreviewSize();
            final byte[] byteArray = ImageUtils.yuv2Jpeg(bytes, size.width, size.height);
            isDetectingFace = true;
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        detectFaces(byteArray);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    private int faceNum = 0;

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
                if (faces.length > 0) {
                    faceNum++;
                    face_detectionNum = 0;
                    if (faceNum > 1) {
                        faceNum = 0;
                        if (!detectedFace) {
                            detectedFace = true;
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
//                                BackActivityTimer(faces);
                                    if (!isDetectedFace) {
                                        String image_base64 = CameraUtils.bitmapToBase64(bm);
                                        CommonUtil.saveLog("base64:", image_base64);
                                        getRobotFaceInfo(image_base64);
                                        mProgressBar.setVisibility(View.VISIBLE);
                                        isDetectedFace = true;
                                        Log.e(TAG, "onFaceDetected: " + image_base64);
                                    }
                                }
                            });
                        }
                    }
                }
            }

            @Override
            public void onFaceNotDetected(Bitmap bm) {
                bm.recycle();
                isDetectingFace = false;
                faceNum = 0;
                face_detectionNum++;
                Log.i(TAG, "noFaceNum:" + face_detectionNum);
                mHandler.sendEmptyMessage(MESSAGE_LOAD);
                if (face_detectionNum > 19) {
                    face_detectionNum = 0;
                    isDetectedFace = false;
//                    CameraUtils.stopPreview();
                    showSNDH();
                    Log.i(TAG, "onFaceNotDetectedback: ");
                }
            }
        });
    }


    private void BannerView() {
        List<String> banner = Constant.getBanner();
        WebBannerAdapter WebBannerAdapter2 = new WebBannerAdapter(this, banner);
        WebBannerAdapter2.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
            }
        });
//        mBannerLayout.setItemSpace(30);
        mBannerLayout.setCenterScale(1.2f);
        mBannerLayout.setAdapter(WebBannerAdapter2);

    }

    //    x左右移动，参数:float 一般调整范围 -100~100，从左到右
    //    y上下移动，参数:float 一般调整范围 -100~100，-100~100，从下到上
    //    z放大缩小，参数:float 一般调整范围 -1000~2000，从大到小
    //人物缩小
    public void onBaseActionSelected() {
        mFuStaEngine.setAnimTransX(-30, 10);
        mFuStaEngine.setAnimTransY(80, 10);
        mFuStaEngine.setAnimTransZ(-1000, 10);
    }

    //人物还原
    public void onBackBaseActionSelected() {
        mFuStaEngine.setAnimTransX(0, 10);
        mFuStaEngine.setAnimTransY(80, 10);
        mFuStaEngine.setAnimTransZ(-1000, 10);
    }

    public void onWebBackBaseActionSelected() {
        mFuStaEngine.setAnimTransX(-35, 10);
        mFuStaEngine.setAnimTransY(80, 10);
        mFuStaEngine.setAnimTransZ(-1000, 10);
    }

    //打招呼
    public void onBaseAnimationActionSelected(String path) {
        mFuStaEngine.updateAnimationOnce(path, new AnimationStateListener() {
            @Override
            public void onAnimationComplete() {
                mHandler.sendEmptyMessage(BASE_ANIMATION_ACTION_SELECTED);
                Log.e(TAG, "onAnimationComplete: 完成打招呼");
            }
        });
    }

    //识别到人
    public void onFaceActionSelected() {
        mFuStaEngine.setAnimTransX(-30, 10);
        mFuStaEngine.setAnimTransY(60, 10);
        mFuStaEngine.setAnimTransZ(-1000, 10);
    }

    //手指 弹出网页
    public void onActionSelected(String path) {
        mFuStaEngine.setAnimTransX(-30, 10);
        mFuStaEngine.setAnimTransY(60, 10);
        mFuStaEngine.setAnimTransZ(-1000, 10);
        mFuStaEngine.updateAnimationOnce(path, new AnimationStateListener() {
            @Override
            public void onAnimationComplete() {
                Log.e(TAG, "onAnimationComplete: 完成手指");
            }
        });
    }

    //未识别到人 回到初始页面
    public void onEndActionSelected(String path, int type) {
        mFuStaEngine.setAnimTransX(-15, 10);
        mFuStaEngine.setAnimTransZ(-650, 10);
        if (type == 1) {
            mFuStaEngine.updateAnimationOnce(path, new AnimationStateListener() {
                @Override
                public void onAnimationComplete() {
                    Log.e(TAG, "onAnimationComplete: 完成鞠躬");
                }
            });
        }
    }


    Handler mHandler = new Handler() {
        @SuppressLint("HandlerLeak")
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case MESSAGE_LOAD:
                    mTV_title_num.setText(face_detectionNum + "");
                    break;
                case BASE_ANIMATION_ACTION_SELECTED:
                    mFuStaEngine.updateAnimationOnce("effect/cartoon_female/animation/STA_anim_kt_def_female_dantanshou.bundle", new AnimationStateListener() {
                        @Override
                        public void onAnimationComplete() {

                        }
                    });
                    break;
                case BASE_ACTION_SELECTED:
                    break;
                case BASE_ACTION_NO:
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
                    mProgressBar.setVisibility(View.GONE);
                    String jsonVal = response.body().string();
                    FaceInfoBean faceInfoBean = new Gson().fromJson(jsonVal, FaceInfoBean.class);
                    if (faceInfoBean.isSuccess()) {
                        isFaceIce = true;
                        onBaseActionSelected();
                        if (!TextUtils.isEmpty(faceInfoBean.getObj().getName())) {
                            showCharFragmentWithName(faceInfoBean.getObj().getId(), faceInfoBean.getObj().getName(), faceInfoBean.getObj().getSex(), faceInfoBean.getObj().getGreetings());
                        } else {
                            showCharFragmentWithName(faceInfoBean.getObj().getId(), "", "", "");
                        }
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


    //显示默认页
    public void showWake() {
//        ActivityManageUtil.getInstance().setAutoComeBack(false);
        mFrameLayoutWebView.setVisibility(View.GONE);
        mBannerLayout.setVisibility(View.VISIBLE);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fl_chat);
        if (fragment instanceof IntroduceFragment) {
            return;
        }
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (introduceFragment == null) {
            introduceFragment = new IntroduceFragment();
        }
        transaction.replace(R.id.fl_chat, introduceFragment).commitAllowingStateLoss();

    }

    //显示webview
    public void showWebView(String url) {
        mFrameLayoutWebView.setVisibility(View.VISIBLE);
        mBannerLayout.setVisibility(View.GONE);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (webFragment == null) {
            Bundle bundle = new Bundle();
            bundle.putString("url", url);
            webFragment = WebFragment.newInstance(bundle);
            transaction.replace(R.id.fl_webView, webFragment).addToBackStack(null).commitAllowingStateLoss();
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("url", url);
            webFragment.setArguments(bundle);
            transaction.replace(R.id.fl_webView, WebFragment.newInstance(bundle)).addToBackStack(null).commitAllowingStateLoss();
        }
    }

    /**
     * 关闭网页
     */
    public void closeWebDialog() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fl_webView);
        if (fragment instanceof WebFragment) {
            FragmentManager fm = getSupportFragmentManager();
            fixBug(fm);
            fm.popBackStack();
        }
    }

    //显示聊天页
    public void showCharFragmentWithName(String id, String name, String sex, String greetings) {
//        ActivityManageUtil.getInstance().setAutoComeBack(true);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.fl_chat);
        if (fragment instanceof ChatFragment) {
            return;
        }
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (chatFragment == null) {
            chatFragment = new ChatFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", id);
        bundle.putString("name", name);
        bundle.putString("sex", sex);
        bundle.putString("greetings", greetings);
        chatFragment.setArguments(bundle);
        transaction.replace(R.id.fl_chat, chatFragment).commitAllowingStateLoss();
    }

    //人脸识别详情页面
    public void showSNDH() {
//        StaUnityUtils.getInstance().getFUStaEngine().stopMediaPlayer();
        StartSurfaceView();
        mFrameLayoutWebView.setVisibility(View.GONE);
        mBannerLayout.setVisibility(View.VISIBLE);
        if (isFaceIce) {
            onEndActionSelected("effect/cartoon_female/animation/STA_anim_kt_def_female_jugong.bundle", 1);
            isFaceIce = false;
        } else {
            onEndActionSelected("effect/cartoon_female/animation/STA_anim_kt_def_female_jugong.bundle", 0);
            isFaceIce = false;
        }
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (materialFragment == null) {
            materialFragment = new MaterialFragment();
        }
        transaction.replace(R.id.fl_chat, materialFragment).commitAllowingStateLoss();
    }

    private void fixBug(FragmentManager fragmentManager) {
        try {
            Class<? extends FragmentManager> aClass = fragmentManager.getClass();
            Method method = aClass.getMethod("noteStateNotSaved");
            method.setAccessible(true);
            method.invoke(fragmentManager);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        mFuStaEngine.stopMediaPlayer();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        CameraUtils.releaseCamera();
        mFuStaEngine.onPause();
    }
}
