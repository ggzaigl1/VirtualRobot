package com.lilosoft.virtualrobot.activity;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.blankj.utilcode.util.ToastUtils;
import com.faceunity.FUParams;
import com.faceunity.FUStaEngine;
import com.faceunity.fuenum.FUAudioProgressType;
import com.faceunity.fuenum.FUAudioType;
import com.faceunity.fuenum.FUTimestampType;
import com.faceunity.sta.OnMediaPlayListener;
import com.faceunity.ui.GLTextureView;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SynthesizerListener;
import com.iflytek.cloud.util.ResourceUtil;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.adapter.WebBannerAdapter;
import com.lilosoft.virtualrobot.entity.Effect;
import com.lilosoft.virtualrobot.utils.EffectFactory;
import com.lilosoft.virtualrobot.utils.FileUtils;
import com.lilosoft.virtualrobot.utils.StaUnityUtils;
import com.lilosoft.virtualrobot.utils.SwitchUtils;
import com.lilosoft.virtualrobot.widget.layoutmanager.BannerLayout;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoActivity1 extends AppCompatActivity implements RecognizerListener {

    // 语音听写对象
    public SpeechRecognizer mIat;
    //合成对象
    public SpeechSynthesizer mTts;
    // 默认发音人
    private String voicer = "xiaoyan";
    private String language = "zh_cn";
    private String resultType = "plain";
    private static final String TAG = "DemoActivity1";
    EditText mResultText;
    private GLTextureView mGlTextureView;
    protected FUStaEngine mFuStaEngine;
    private String mWavPath;
    BannerLayout mBannerLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        mResultText = findViewById(R.id.edit_query);
        mGlTextureView = findViewById(R.id.gl_surface);
        mBannerLayout = findViewById(R.id.recycler_ver);
        mFuStaEngine = StaUnityUtils.getInstance().getFUStaEngine();
        File wavDir = FileUtils.getWavCacheDir(this);
        mWavPath = new File(wavDir, FileUtils.getUUID32() + FileUtils.WAV_EXTENSION).getAbsolutePath();

        mIat = SpeechRecognizer.createRecognizer(this, mInitListener);
        setParam();
        mTts = SpeechSynthesizer.createSynthesizer(this, mTtsInitListener);
        setTtsParam();

        initAnimationManager(mGlTextureView);
        mGlTextureView.setOpaque(false);

        List<String> list = new ArrayList<>();
        list.add("https://wanandroid.com/blogimgs/bfcf57e5-aa5d-4ca3-9ca9-245dcbfd31e9.png");
        list.add("https://www.wanandroid.com/blogimgs/62c1bd68-b5f3-4a3c-a649-7ca8c7dfabe6.png");
        list.add("https://www.wanandroid.com/blogimgs/50c115c2-cf6c-4802-aa7b-a4334de444cd.png");
        WebBannerAdapter webBannerAdapter = new WebBannerAdapter(this, list);
        webBannerAdapter.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
            }
        });
//        mBannerLayout.setItemSpace(10);
        mBannerLayout.setAdapter(webBannerAdapter);

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
    }


    //合成回调监听。
    public void TtsListener(String msg) {
        mTts.synthesizeToUri(msg, mWavPath, new SpeechListener());
        RecognizerListener();
    }

    //听写监听器。
    public void RecognizerListener() {
        mIat.startListening(this);
    }

    /**
     * 初始化监听器。
     */
    private InitListener mInitListener = new InitListener() {

        @Override
        public void onInit(int code) {
            Log.d(TAG, "SpeechRecognizer init() code = " + code);
            if (code != ErrorCode.SUCCESS) {
                ToastUtils.showShort("初始化失败，错误码：" + code + ",请点击网址https://www.xfyun.cn/document/error-code查询解决方案");
            }
        }
    };

    /**
     * 初始化监听。
     */
    private InitListener mTtsInitListener = new InitListener() {
        @Override
        public void onInit(int code) {
            Log.e(TAG, "InitListener init() code = " + code);
            if (code != ErrorCode.SUCCESS) {
                ToastUtils.showShort("初始化失败,错误码：" + code + ",请点击网址https://www.xfyun.cn/document/error-code查询解决方案");
            } else {
                // 初始化成功，之后可以调用startSpeaking方法
                // 注：有的开发者在onCreate方法中创建完合成对象之后马上就调用 startSpeaking 进行合成，
                // 正确的做法是将onCreate中的startSpeaking调用移至这里
            }
        }
    };

    /**
     * 语音听写 参数设置
     *
     * @return
     */
    public void setParam() {
        // 清空参数
        mIat.setParameter(SpeechConstant.PARAMS, null);
        // 设置听写引擎
        mIat.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD);
        // 设置返回结果格式
        mIat.setParameter(SpeechConstant.RESULT_TYPE, resultType);
        mIat.setParameter(SpeechConstant.ACCENT, language);
        Log.e(TAG, "last language:" + mIat.getParameter(SpeechConstant.LANGUAGE));
        //此处用于设置dialog中不显示错误码信息
        //mIat.setParameter("view_tips_plain","false");
        // 设置语音前端点:静音超时时间，即用户多长时间不说话则当做超时处理1000~10000
        mIat.setParameter(SpeechConstant.VAD_BOS, "3000");
        // 设置语音后端点:后端点静音检测时间，即用户停止说话多长时间内即认为不再输入， 自动停止录音0~10000
        mIat.setParameter(SpeechConstant.VAD_EOS, "1300");
        // 设置标点符号,设置为"0"返回结果无标点,设置为"1"返回结果有标点
        mIat.setParameter(SpeechConstant.ASR_PTT, "0");
        // 设置音频保存路径，保存音频格式支持pcm、wav，设置路径为sd卡请注意WRITE_EXTERNAL_STORAGE权限
        mIat.setParameter(SpeechConstant.AUDIO_FORMAT, "wav");
        mIat.setParameter("nunum", "1");
        mIat.setParameter(SpeechConstant.ASR_AUDIO_PATH, Environment.getExternalStorageDirectory() + "/msc/iat.wav");
    }

    /**
     * 语音合成 参数设置
     *
     * @return
     */
    private void setTtsParam() {
        // 清空参数
        mTts.setParameter(SpeechConstant.PARAMS, null);
        //设置合成
        mTts.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_XTTS);
        //设置发音人资源路径
        mTts.setParameter(ResourceUtil.TTS_RES_PATH, getResourcePath());
        //设置发音人
        mTts.setParameter(SpeechConstant.VOICE_NAME, voicer);
        //mTts.setParameter(SpeechConstant.TTS_DATA_NOTIFY,"1");//支持实时音频流抛出，仅在synthesizeToUri条件下支持
        //设置合成语速
        mTts.setParameter(SpeechConstant.SPEED, "50");
        //设置合成音调
        mTts.setParameter(SpeechConstant.PITCH, "50");
        //设置合成音量
        mTts.setParameter(SpeechConstant.VOLUME, "50");
        //设置播放器音频流类型
        mTts.setParameter(SpeechConstant.STREAM_TYPE, "3");
        //	mTts.setParameter(SpeechConstant.STREAM_TYPE, AudioManager.STREAM_MUSIC+"");
        // 设置播放合成音频打断音乐播放，默认为true
        mTts.setParameter(SpeechConstant.KEY_REQUEST_FOCUS, "true");
        // 设置音频保存路径，保存音频格式支持pcm、wav，设置路径为sd卡请注意WRITE_EXTERNAL_STORAGE权限
        mTts.setParameter(SpeechConstant.AUDIO_FORMAT, "wav");
        mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, Environment.getExternalStorageDirectory() + "/msc/tts.wav");
    }

    //获取发音人资源路径
    private String getResourcePath() {
        StringBuffer tempBuffer = new StringBuffer();
        String type = "xtts";
        //合成通用资源
        tempBuffer.append(ResourceUtil.generateResourcePath(this, ResourceUtil.RESOURCE_TYPE.assets, type + "/common.jet"));
        tempBuffer.append(";");
        //发音人资源
        tempBuffer.append(ResourceUtil.generateResourcePath(this, ResourceUtil.RESOURCE_TYPE.assets, type + "/" + voicer + ".jet"));
        return tempBuffer.toString();
    }


    private class SpeechListener implements SynthesizerListener {

        @Override
        public void onSpeakBegin() {

        }

        @Override
        public void onBufferProgress(int i, int i1, int i2, String s) {

        }

        @Override
        public void onSpeakPaused() {

        }

        @Override
        public void onSpeakResumed() {

        }

        @Override
        public void onSpeakProgress(int i, int i1, int i2) {

        }

        @Override
        public void onCompleted(SpeechError speechError) {
            Log.e(TAG, "onCompleted() called with: speechError = [" + speechError + "], wavPath = [" + mWavPath + "]");
            File wavFile = new File(mWavPath);
//            File wavFile = new File("/storage/emulated/0/Android/data/com.lilosoft.virtualrobot/cache/wav/9128b00f272843b1b6b2309e57c3f0d5.wav");
            if (wavFile.exists()) {
                try {
                    byte[] audio = FileUtils.readBytesFromFile(wavFile);
                    FUParams params = new FUParams()
                            .setStreamMode(0)
                            .setAudioData(audio)
                            .setAudioType(FUAudioType.WAV)
                            .setTimestamp("2.9570026 3.109003")
//                            .setAudioProgressType(FUAudioProgressType.AUDIO_SINGLE)
                            .setAlignText("星采用多星组网模式")
                            .setTimestampType(FUTimestampType.CHARACTER);
                    long duration = System.currentTimeMillis();
                    Log.e(TAG, "onCompleted " + "call duration :" + duration);
                    StaUnityUtils.getInstance().getFUStaEngine().startStaDrivingProcess(params);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                Log.e(TAG, "WAV音频缓存失败");
            }
        }

        @Override
        public void onEvent(int i, int i1, int i2, Bundle bundle) {

        }
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
        Log.e(TAG, recognizerResult.getResultString());
        mResultText.append(recognizerResult.getResultString());
        String context = mResultText.getText().toString();
        if (b) {
            TtsListener("而在听写返回结果时，会结合上下文，把日常生活中，出现频率最高的词汇返回给客户端。这时，如果我们实际想要的结果并不是出现频率最高的词汇。");
            mResultText.setText(context);
            mResultText.setText(null);
        }
    }

    @Override
    public void onError(SpeechError speechError) {
        mResultText.setText(null);
        RecognizerListener();
    }

    @Override
    public void onEvent(int i, int i1, int i2, Bundle bundle) {

    }

    public void startDetect(View view) {
        TtsListener("而在听写返回结果时，会结合上下文，把日常生活中，出现频率最高的词汇返回给客户端。");
    }
}
