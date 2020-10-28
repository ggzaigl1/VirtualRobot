package com.lilosoft.virtualrobot.base;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.SpeechSynthesizer;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.tts.XunfeiTtsHandler;
import com.lilosoft.virtualrobot.utils.FileUtils;

import java.io.File;
import java.util.Objects;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment extends Fragment implements RecognizerListener {

    protected Context mContext;
    public static final String TAG = BaseFragment.class.getSimpleName();
    private Unbinder mUnbinder;
    // 语音听写对象
    public SpeechRecognizer mIat;
    //合成对象
    public SpeechSynthesizer mTts;
    // 默认发音人
    private String voicer = "xiaofeng";
    private String language = "zh_cn";
    private String resultType = "plain";
    public String mWavPath;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResId(), container, false);
        mUnbinder = ButterKnife.bind(this, rootView);
        mIat = SpeechRecognizer.createRecognizer(getActivity(), mInitListener);
        setParam();

        File wavDir = FileUtils.getWavCacheDir(getActivity());
        mWavPath = new File(wavDir, FileUtils.getUUID32() + FileUtils.WAV_EXTENSION).getAbsolutePath();

        mTts = SpeechSynthesizer.createSynthesizer(getActivity(), mTtsInitListener);
        setTtsParam();
//        setTtsParam(mWavPath);
        init(savedInstanceState, rootView);
        return rootView;
    }

    public abstract void init(Bundle savedInstanceState, View view);

    public abstract int getLayoutResId();

    public void ToastMessage(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
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
        mIat.setParameter(SpeechConstant.VAD_BOS, "5000");
        // 设置语音后端点:后端点静音检测时间，即用户停止说话多长时间内即认为不再输入， 自动停止录音0~10000
        mIat.setParameter(SpeechConstant.VAD_EOS, "500");
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
//    private void setTtsParam(String path) {
//        // 清空参数
//        mTts.setParameter(SpeechConstant.PARAMS, null);
//        // 根据合成引擎设置相应参数
//        mTts.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD);
//        // 引擎类型
//        mTts.setParameter(SpeechConstant.TTS_DATA_NOTIFY, "1");
//        // 设置在线合成发音人
//        // 默认发音人
//        mTts.setParameter(SpeechConstant.VOICE_NAME, "xiaofeng");
//        //设置合成语速
//        mTts.setParameter(SpeechConstant.SPEED, "50");
//        //设置合成音调
//        mTts.setParameter(SpeechConstant.PITCH, "50");
//        //设置合成音量
//        mTts.setParameter(SpeechConstant.VOLUME, "50");
//        //设置播放器音频流类型
//        mTts.setParameter(SpeechConstant.STREAM_TYPE, "3");
//        // 设置播放合成音频打断音乐播放，默认为true
//        mTts.setParameter(SpeechConstant.KEY_REQUEST_FOCUS, "true");
//        // 设置音频保存路径，保存音频格式支持pcm、wav
//        mTts.setParameter(SpeechConstant.AUDIO_FORMAT, "wav");
//        mTts.setParameter("nunum", "1");
//        mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, path);
//    }


    /**
     * 停止合成朗读
     */
    public void stopSpeechRecognizerVoice() {
        boolean speaking = mTts.isSpeaking();
        if (speaking) {
            if (mTts != null) {
                mTts.pauseSpeaking();
                mTts.stopSpeaking();
            }
        }
    }

    public void release() {
        if (mTts != null) {
            mTts.stopSpeaking();
            mTts.destroy();
            mTts = null;
        }
    }

    public void resumeSpeaking() {
        if (mTts != null) {
            if (mTts.isSpeaking()) {
                mTts.resumeSpeaking();
            }
        }
    }

    public void stopSpeaking() {
        if (mTts != null) {
            if (mTts.isSpeaking()) {
                mTts.stopSpeaking();
            }
        }
    }

    public Animation shakeAnimation(int CycleTimes) {
        Animation translateAnimation = new TranslateAnimation(0, 10, 0, 0);
        translateAnimation.setInterpolator(new CycleInterpolator(CycleTimes));
        translateAnimation.setDuration(400);
        return translateAnimation;
    }

    /**
     * 设置TextView 数据空
     *
     * @param view
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void SetDateEmpty(TextView view, String context) {
        view.setText("");
        view.setText(context);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            view.setTextColor(Objects.requireNonNull(getContext()).getColor(R.color.white_100));
        } else {
            view.setTextColor(Objects.requireNonNull(getContext()).getResources().getColor(R.color.white_100));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}
