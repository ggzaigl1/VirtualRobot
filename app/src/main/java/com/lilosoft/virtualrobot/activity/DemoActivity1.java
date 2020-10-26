package com.lilosoft.virtualrobot.activity;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.blankj.utilcode.util.ToastUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SynthesizerListener;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.utils.ActivityManageUtil;

public class DemoActivity1 extends AppCompatActivity implements RecognizerListener, SynthesizerListener {

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        mResultText = findViewById(R.id.edit_query);
        mIat = SpeechRecognizer.createRecognizer(this, mInitListener);
        setParam();
        mTts = SpeechSynthesizer.createSynthesizer(this, mTtsInitListener);
        setTtsParam();
        TtsListener("而在听写返回结果时，会结合上下文，把日常生活中，出现频率最高的词汇返回给客户端。这时，如果我们实际想要的结果并不是出现频率最高的词汇，如上文中我们实际要的是“张姗”——这样的情况在手机联系人信息中经常会出现，此时听写结果就不是我们想要的。" +
                "这种情况下，我们可以通过上传个性化热词的方式，增加热词的识别权重，需要注意的这些个性化信息只是增加相应词条的识别率，但并不是绝对的。");
    }

    //合成回调监听。
    public void TtsListener(String msg) {
        mTts.startSpeaking(msg, this);
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
        // 根据合成引擎设置相应参数
        mTts.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD);
        //语音合成人
        mTts.setParameter(SpeechConstant.VOICE_NAME, voicer);
        // 设置在线合成发音人
        //设置合成语速
        mTts.setParameter(SpeechConstant.SPEED, "50");
        //设置合成音调
        mTts.setParameter(SpeechConstant.PITCH, "50");
        //设置合成音量
        mTts.setParameter(SpeechConstant.VOLUME, "50");
        //设置播放器音频流类型
        mTts.setParameter(SpeechConstant.STREAM_TYPE, "3");
        // 设置播放合成音频打断音乐播放，默认为true
        mTts.setParameter(SpeechConstant.KEY_REQUEST_FOCUS, "true");
        // 设置音频保存路径，保存音频格式支持pcm、wav，设置路径为sd卡请注意WRITE_EXTERNAL_STORAGE权限
        mTts.setParameter(SpeechConstant.AUDIO_FORMAT, "pcm");
        mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, Environment.getExternalStorageDirectory() + "/msc/tts.pcm");
        //支持实时音频返回，仅在synthesizeToUri条件下支持
        mTts.setParameter(SpeechConstant.TTS_DATA_NOTIFY, "1");
        //	mTts.setParameter(SpeechConstant.TTS_BUFFER_TIME,"1");

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
            TtsListener("而在听写返回结果时，会结合上下文，把日常生活中，出现频率最高的词汇返回给客户端。这时，如果我们实际想要的结果并不是出现频率最高的词汇，如上文中我们实际要的是“张姗”——这样的情况在手机联系人信息中经常会出现，此时听写结果就不是我们想要的。\" +\n" +
                    "                \"这种情况下，我们可以通过上传个性化热词的方式，增加热词的识别权重，需要注意的这些个性化信息只是增加相应词条的识别率，但并不是绝对的。");
            mResultText.setText(context);
            mResultText.setText(null);
        }
    }

    @Override
    public void onError(SpeechError speechError) {
        mResultText.setText(null);
        RecognizerListener();
    }

    //1111111111111111111111111111111
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
        if (speechError == null) {
            mResultText.setText(null);
            Log.e(TAG, "播放完成: ");
        }
    }

    @Override
    public void onEvent(int i, int i1, int i2, Bundle bundle) {

    }
}
