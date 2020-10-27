package com.lilosoft.virtualrobot.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.faceunity.FUStaEngine;
import com.faceunity.sta.OnMediaPlayListener;
import com.faceunity.ui.GLTextureView;
import com.google.gson.Gson;
import com.iflytek.cloud.SpeechSynthesizer;
import com.lilosoft.virtualrobot.Constant;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.adapter.WebBannerAdapter;
import com.lilosoft.virtualrobot.bean.BannerBean;
import com.lilosoft.virtualrobot.bean.FaceInfoBean;
import com.lilosoft.virtualrobot.entity.Effect;
import com.lilosoft.virtualrobot.net.ApiService;
import com.lilosoft.virtualrobot.tts.XunfeiTtsHandler;
import com.lilosoft.virtualrobot.utils.EffectFactory;
import com.lilosoft.virtualrobot.utils.StaUnityUtils;
import com.lilosoft.virtualrobot.utils.SwitchUtils;
import com.lilosoft.virtualrobot.widget.layoutmanager.BannerLayout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import okhttp3.ResponseBody;
import pl.droidsonroids.gif.GifImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class DemoActivity extends AppCompatActivity {

    @BindView(R.id.recycler_ver)
    BannerLayout mBannerLayout;
    String banner = "{\"data\":[{\"desc\":\"享学~\",\"id\":29,\"imagePath\":\"https://wanandroid.com/blogimgs/bfcf57e5-aa5d-4ca3-9ca9-245dcbfd31e9.png\",\"isVisible\":1,\"order\":0,\"title\":\"【Android开发教程】高级UI：自定义ViewGroup与UI性能优化\",\"type\":0,\"url\":\"https://www.bilibili.com/video/BV1Ka4y1j7HA\"},{\"desc\":\"\",\"id\":6,\"imagePath\":\"https://www.wanandroid.com/blogimgs/62c1bd68-b5f3-4a3c-a649-7ca8c7dfabe6.png\",\"isVisible\":1,\"order\":1,\"title\":\"我们新增了一个常用导航Tab~\",\"type\":1,\"url\":\"https://www.wanandroid.com/navi\"},{\"desc\":\"一起来做个App吧\",\"id\":10,\"imagePath\":\"https://www.wanandroid.com/blogimgs/50c115c2-cf6c-4802-aa7b-a4334de444cd.png\",\"isVisible\":1,\"order\":1,\"title\":\"一起来做个App吧\",\"type\":1,\"url\":\"https://www.wanandroid.com/blog/show/2\"},{\"desc\":\"\",\"id\":20,\"imagePath\":\"https://www.wanandroid.com/blogimgs/90c6cc12-742e-4c9f-b318-b912f163b8d0.png\",\"isVisible\":1,\"order\":2,\"title\":\"flutter 中文社区 \",\"type\":1,\"url\":\"https://flutter.cn/\"}],\"errorCode\":0,\"errorMsg\":\"\"}";
    String[] imageUrls;
    private static final String TAG = "DemoActivity";
    private GLTextureView mGlTextureView;
    protected FUStaEngine mFuStaEngine;
    private boolean isv = true;
    XunfeiTtsHandler xunfeiTtsHandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Constant.sShowMode = Constant.SHOW_MODE_FULL;
        getWindow().setBackgroundDrawable(null);
        setContentView(R.layout.activity_demo);

        mGlTextureView = findViewById(R.id.gl_surface);
        mFuStaEngine = StaUnityUtils.getInstance().getFUStaEngine();
//        mFuStaEngine.setAnimTransX(20);
        Constant.POPUP_SELECTED_ENTITY.clear();
        initAnimationManager(mGlTextureView);
        mGlTextureView.setOpaque(false);

        xunfeiTtsHandler = new XunfeiTtsHandler(this);
        xunfeiTtsHandler.initTts();


        Gson gson = new Gson();
        BannerBean bannerBean = gson.fromJson(banner, BannerBean.class);
        imageUrls = new String[bannerBean.getData().size()];
        if (bannerBean.getData().size() > 0) {
            for (int i = 0; i < bannerBean.getData().size(); i++) {
                String url = bannerBean.getData().get(i).getImagePath();
                imageUrls[i] = url;
            }
        }
//
        WebBannerAdapter WebBannerAdapter2 = new WebBannerAdapter(this, new ArrayList<>(Arrays.asList(imageUrls)));
        WebBannerAdapter2.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
            }
        });
//        mBannerLayout.setItemSpace(10);
//        mBannerLayout.setAdapter(WebBannerAdapter2);

    }

    protected void initAnimationManager(GLTextureView glTextureView) {
        mFuStaEngine.onCreate(glTextureView);
        mFuStaEngine.setAnimTransY(80, 10);
        mFuStaEngine.setAnimTransZ(-1000, 10);
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
    }


    public void getReport() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constant.RobotURL)
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("access_token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiYm9vdC1zZXJ2ZXIiXSwic2NvcGUiOlsic2VsZWN0Il0sImV4cCI6MTYwMjMxMzI5OCwiYXV0aG9yaXRpZXMiOlsiQ0xJRU5UIiwiQURNSU4iXSwianRpIjoiYjA4ZWExYWEtMjlhOC00ZThlLWIzNWQtNjlkNjc2MTU4NDVmIiwiY2xpZW50X2lkIjoiZWYxZmFjOGRlMDliNDVmYmE5OGZhNzFjZGMzMjFiODUifQ.bwcK-WYx7mlwSDYdYcKdXm1OXmbpaQ_9duvLI_Q3_fw");
        paramMap.put("enterprise_code", "llcs");
        paramMap.put("image_base64", "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");
        paramMap.put("service_id", Constant.serviceId);
        Call<ResponseBody> call = apiService.robotFaceInfo(paramMap);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(@NonNull Call<ResponseBody> call, @NonNull retrofit2.Response<ResponseBody> response) {
                try {
                    String jsonVal = response.body().string();
                    FaceInfoBean faceInfoBean = new Gson().fromJson(jsonVal, FaceInfoBean.class);
                    Log.e(TAG, faceInfoBean.getObj().getId());
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


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    SpeechSynthesizer Tts;

    public void startDetect(View view) {
        xunfeiTtsHandler.start("2020年10月26日23时19分，我国在西昌卫星发射中心用长征二号丙运载火箭，成功将遥感三十号07组卫星送入预定轨道，发射获得圆满成功。此次任务还搭载发射了天启星座06星。");
    }

    public void startDetect1(View view) {
        mFuStaEngine.stopMediaPlayer();
        xunfeiTtsHandler.start("遥感三十号07组卫星采用多星组网模式，主要用于开展电磁环境探测及相关技术试验。天启星座06星是北京国电高科科技有限公司研制的短报文通信卫星");
    }
}
