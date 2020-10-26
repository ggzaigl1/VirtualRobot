package com.lilosoft.virtualrobot.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.faceunity.FUStaEngine;
import com.lilosoft.virtualrobot.Constant;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.base.BaseActivity;
import com.lilosoft.virtualrobot.bean.InitializeBean;
import com.lilosoft.virtualrobot.bean.TokenBean;
import com.lilosoft.virtualrobot.entity.Effect;
import com.lilosoft.virtualrobot.net.result.RetrofitRequest;
import com.lilosoft.virtualrobot.utils.CameraUtils;
import com.lilosoft.virtualrobot.utils.EffectFactory;
import com.lilosoft.virtualrobot.utils.GsonConverter;
import com.lilosoft.virtualrobot.utils.StaUnityUtils;
import com.lilosoft.virtualrobot.utils.ThreadHelper;
import com.permissionx.guolindev.PermissionX;
import com.permissionx.guolindev.callback.ExplainReasonCallback;
import com.permissionx.guolindev.callback.RequestCallback;
import com.permissionx.guolindev.request.ExplainScope;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import butterknife.BindView;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

/**
 * 初始化
 */
public class InitActivity extends BaseActivity {

    @BindView(R.id.load_gif)
    GifImageView load_gif;
    @BindView(R.id.progress)
    ProgressBar mProgressBar;
    @BindView(R.id.tv_hint)
    TextView mTv_hint;

    private ArrayList<String> listString;
    private ArrayList<InitializeBean.ObjBean.RobotBean.GreetingsBean> GreetingsListString;
    private String logoImgUrl = "";
    private String logoName = "";
    private static final int MESSAGE_LOAD = 1;
    private static final int MESSAGE_MAIN = 2;
    private static final int HAS_CAMERA = 3;
    private static final int INIT_COMPLETE = 4;
    private static final int INIT_ERROR = 5;


    @Override
    public int getContentViewResId() {
        return R.layout.activity_init;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        mTv_hint.setText("设备初始化中....");
        verifyStoragePermissions(this);
    }

    private void initDate() {
        mTv_hint.setText("初始化完成,即将进入...");
        listString = new ArrayList<>();
        GreetingsListString = new ArrayList<>();
        mHandler.sendEmptyMessageDelayed(MESSAGE_LOAD, 1000);
    }

    private void initGif() {
        try {
            GifDrawable gifFromAssets = new GifDrawable(getAssets(), "load.gif");
            load_gif.setImageDrawable(gifFromAssets);
            gifFromAssets.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Token
     *
     * @return
     */
    public void loadToken() {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("serviceId", Constant.serviceId);
        RetrofitRequest.sendPostRequest(Constant.RobotURL + "accessToken", paramMap, TokenBean.class, new RetrofitRequest.ResultHandler<TokenBean>((this)) {

            @Override
            public void onBeforeResult() {
            }

            @Override
            public void onResult(TokenBean tokenBean) {
                if (tokenBean.isSuccess()) {
                    Log.e(TAG, "onResult: " + tokenBean.getObj().getAccess_token());
                    Constant.setToken(tokenBean.getObj().getAccess_token());
                    getInitialize(tokenBean.getObj().getAccess_token());
                }
            }

            @Override
            public void onAfterFailure() {
                ToastMessage(getString(R.string.net_server_connected_error));
            }
        });
    }

    /**
     * 初始化
     *
     * @param token
     */
    public void getInitialize(String token) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("serviceId", Constant.serviceId);
        paramMap.put("access_token", token);
        RetrofitRequest.sendPostRequest(Constant.RobotURL + "v1/robot/initialize", paramMap, InitializeBean.class, new RetrofitRequest.ResultHandler<InitializeBean>((this)) {

            @Override
            public void onBeforeResult() {
            }

            @Override
            public void onResult(InitializeBean initializeBean) {
                mProgressBar.setVisibility(View.GONE);
                if (initializeBean.isSuccess()) {
                    String chatUrl = "";
                    String url = initializeBean.getObj().getApis().get(0).getUrl();
                    String enterpriseCode = initializeBean.getObj().getRobot().getEnterpriseCode();
                    String areaCode = initializeBean.getObj().getRobot().getAreaCode();//区划
                    String backImgUrl = initializeBean.getObj().getRobot().getBackImgUrl();//机器人背景图
                    logoImgUrl = initializeBean.getObj().getRobot().getLogoImgUrl();
                    logoName = initializeBean.getObj().getRobot().getLogoName();
                    List<String> cartographys = initializeBean.getObj().getRobot().getCartographys();//轮播图
                    String event_url = "";
                    String project = "";
                    String face_info = "";
                    List<InitializeBean.ObjBean.ApisBean> apis = initializeBean.getObj().getApis();
                    for (int i = 0; i < apis.size(); i++) {
                        String code = initializeBean.getObj().getApis().get(i).getCode();
                        if (code.equals("chatUrl")) {
                            chatUrl = initializeBean.getObj().getApis().get(i).getUrl();
                        }
                    }

                    for (int i = 0; i < cartographys.size(); i++) {
                        String content = initializeBean.getObj().getRobot().getCartographys().get(i);
                        listString.add(i, content);
                    }

                    List<InitializeBean.ObjBean.FunctionsBean> functions = initializeBean.getObj().getFunctions();
                    for (int i = 0; i < functions.size(); i++) {
                        String code = initializeBean.getObj().getFunctions().get(i).getCode().toLowerCase();
                        switch (code) {
                            case "web":
                                event_url = initializeBean.getObj().getFunctions().get(i).getUrl();
                                Log.e(TAG, "event_url: " + event_url);
                                break;
                            case "project":
                                project = initializeBean.getObj().getFunctions().get(i).getUrl();
                                Log.e(TAG, "project: " + project);
                                break;
                            case "faceinfo":
                                face_info = initializeBean.getObj().getFunctions().get(i).getUrl();
                                Log.e(TAG, "faceinfo: " + face_info);
                                break;
                        }
                    }

                    List<InitializeBean.ObjBean.RobotBean.GreetingsBean> greetings = initializeBean.getObj().getRobot().getGreetings();//问候语
                    for (int i = 0; i < greetings.size(); i++) {
                        String content = initializeBean.getObj().getRobot().getGreetings().get(i).getContent();
                        GreetingsListString.add(i, greetings.get(i));
                    }

                    Constant.setBanner(listString);
                    Constant.setEventWebUrl(event_url);
                    Constant.setProjectWebUrl(project);
                    Constant.setFaceinfoWebUrl(face_info);
                    Constant.setBase_URL(chatUrl);
                    Constant.setEnterpriseCode(enterpriseCode);
                    Constant.setAREACODE(areaCode);
                    Constant.setGreetings(GreetingsListString);
                    Constant.setBackImgUrl(backImgUrl);
                    mHandler.sendEmptyMessage(MESSAGE_MAIN);
                }
            }

            @Override
            public void onAfterFailure() {
                ToastMessage(getString(R.string.net_server_connected_error));
            }
        });
    }

    public void verifyStoragePermissions(final Activity activity) {
        PermissionX.init(this)
                .permissions(Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.CAMERA,
                        Manifest.permission.RECORD_AUDIO)
                .onExplainRequestReason(new ExplainReasonCallback() {
                    @Override
                    public void onExplainReason(ExplainScope scope, List<String> deniedList) {
                        scope.showRequestReasonDialog(deniedList, "需要您同意以下权限才能正常使用"
                                , "确定", "取消");
                    }
                }).request(new RequestCallback() {
            @Override
            public void onResult(boolean allGranted, List<String> grantedList, List<String> deniedList) {
                if (allGranted) {
                    handlePermissionResult();
                } else {
                    Toast.makeText(activity, "您拒绝了如下权限：$deniedList" + deniedList, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void handlePermissionResult() {
        initGif();
        ThreadHelper.getInstance().enqueueOnUiThread(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                parseEffectInfoFromResource(InitActivity.this);
                StaUnityUtils.getInstance().init(InitActivity.this);
                return null;
            }
        }, new ThreadHelper.Callback<Void>() {

            @Override
            protected void onSuccess(Void result) {
                super.onSuccess(result);
                /**
                 * SDK初始化，两种初始化方式
                 *
                 * 没有初始化完成回调的方式，如果调用该方法之后紧接着调用口型驱动方法，口型驱动任务会等待初始化任务完成才开始
                 * 用户端表现为第一次口型驱动耗时时间长
                 */
                // StaUnityUtils.getInstance().getFUStaEngine().init(null);
                /**
                 * SDK初始化，两种初始化方式
                 *
                 * 有初始化完成回调的方式，SDK初始化完成的回调，进入功能页面
                 */
                STAInitListener mInitListener = new STAInitListener();
                StaUnityUtils.getInstance().getFUStaEngine().init(mInitListener);
            }

            @Override
            protected void onFailure(Throwable throwable) {
                super.onFailure(throwable);
                ToastUtils.showShort(throwable.getMessage());
            }
        });
    }

    private void parseEffectInfoFromResource(Context context) {
        try {
            AssetManager assets = context.getAssets();
            ArrayList<String> configPath = new ArrayList();

            /**
             * 配置demo可加载的形象及其对应的动作等资源
             */
            configPath.add("effect/cartoon_male/effect_config.json");
            configPath.add("effect/real_female/effect_config.json");
            configPath.add("effect/cartoon_female/effect_config.json");
            configPath.add("effect/real_male/effect_config.json");
            configPath.add("effect/cartoon_book/effect_config.json");
            configPath.add("effect/cartoon_cattle/effect_config.json");
            configPath.add("effect/cartoon_pig/effect_config.json");

            if (configPath != null && configPath.size() > 0) {
                ArrayList<Effect> effectList = new ArrayList<>();
                for (String path : configPath) {
                    InputStream inputStream = assets.open(path);
                    byte[] effectData = new byte[inputStream.available()];
                    inputStream.read(effectData);
                    inputStream.close();
                    String json = new String(effectData);
                    Effect effect = GsonConverter.fromJson(json, Effect.class);
                    effectList.add(effect);
                }
                EffectFactory.setEffectList(effectList);
            }
        } catch (IOException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    // 初始状态监听器,监听init是否成功
    private class STAInitListener implements FUStaEngine.STAInitListener {

        @Override
        public void onInitComplete() {
            mHandler.sendEmptyMessage(HAS_CAMERA);
        }

        @Override
        public void onError(String msg) {
            Message message = new Message();
            message.obj = msg;
            message.what = INIT_ERROR;
            mHandler.sendMessage(message);
        }
    }

    @SuppressLint("HandlerLeak")
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case MESSAGE_LOAD:
                    loadToken();
                    break;
                case MESSAGE_MAIN:
                    Intent intent = new Intent(InitActivity.this, MainActivity.class);
                    intent.putExtra("logoImgUrl", logoImgUrl);
                    intent.putExtra("logoName", logoName);
                    startActivity(intent);
                    finish();
                    break;
                case HAS_CAMERA:
                    PackageManager pm = getPackageManager();
                    boolean hasACamera = pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY) || pm.hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT) || Camera.getNumberOfCameras() > 0;
                    if (hasACamera) {
//                        mTv_hint.setText("相机初始化正常");
                        mHandler.sendEmptyMessageDelayed(INIT_COMPLETE, 2000);
                    } else {
                        mTv_hint.setText("相机初始化失败,请检查");
                    }
                    break;
                case INIT_COMPLETE:
                    initDate();
                    break;
                case INIT_ERROR:
                    mTv_hint.setText((String) msg.obj);
                    break;
            }
        }
    };
}
