package com.lilosoft.virtualrobot.tts;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.TextView;

import com.faceunity.FUParams;
import com.faceunity.fuenum.FUAudioProgressType;
import com.faceunity.fuenum.FUAudioType;
import com.faceunity.fuenum.FUTimestampType;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.SynthesizerListener;
import com.lilosoft.virtualrobot.utils.FileUtils;
import com.lilosoft.virtualrobot.utils.StaUnityUtils;

import java.io.File;
import java.io.IOException;

/**
 * 文档：https://doc.xfyun.cn/msc_android/%E8%AF%AD%E9%9F%B3%E5%90%88%E6%88%90.html
 * 讯飞TTS,非流式无时间戳TTS方案，可采用非流式方式ASR、Align方案，此处采用非流式ASR方式
 *
 * @author Richie on 2019.01.08
 */
public class XunfeiTtsHandler {
    private SpeechSynthesizer mTts;
    private Context mContext;
    private String mWavPath;
    private String mText;
    private static final String TAG = "XunfeiTtsHandler";

    public XunfeiTtsHandler(Context context) {
        mContext = context;
    }

    public void initTts() {
        mTts = SpeechSynthesizer.createSynthesizer(mContext, new InitListener() {
            @Override
            public void onInit(int i) {
                Log.e(TAG, "onInit:{}: " + i);
            }
        });
    }

    public void start(@NonNull String text) {
        if (mTts == null) {
            initTts();
        }
        mText = text;
        File wavDir = FileUtils.getWavCacheDir(mContext);
        mWavPath = new File(wavDir, FileUtils.getUUID32() + FileUtils.WAV_EXTENSION).getAbsolutePath();
        setParam(mWavPath);
        mTts.synthesizeToUri(mText, mWavPath, new SpeechListener());
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

    public void num(int errorNum, TextView textView, String message) {
        if (mTts.isSpeaking()) {
            errorNum = 0;
        } else {
            if (textView != null) {
                textView.setTextColor(Color.WHITE);
                textView.setText(message);
                start(message);
                errorNum = 0;
            }
        }
    }

    /**
     * 参数设置
     *
     * @return
     */
    private void setParam(String path) {
        // 清空参数
        mTts.setParameter(SpeechConstant.PARAMS, null);
        // 根据合成引擎设置相应参数
        mTts.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD);
        // 引擎类型
        mTts.setParameter(SpeechConstant.TTS_DATA_NOTIFY, "1");
        // 设置在线合成发音人
        // 默认发音人
        mTts.setParameter(SpeechConstant.VOICE_NAME, "xiaofeng");
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
        // 设置音频保存路径，保存音频格式支持pcm、wav
        mTts.setParameter(SpeechConstant.AUDIO_FORMAT, "wav");
        mTts.setParameter("nunum", "1");
        mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, path);
    }

    private class SpeechListener implements SynthesizerListener {
        // 分段处理，每 3 秒为一段
        private static final int SECONDS = 3;

        // invoke on main thread
        @Override
        public void onSpeakBegin() {
            Log.e(TAG, "onSpeakBegin() called");
            if (mTts.isSpeaking()) {
                mTts.pauseSpeaking();
            }

        }

        @Override
        public void onBufferProgress(int percent, int beginPos, int endPos, String info) {
            Log.e(TAG, "onBufferProgress() called with: percent = [" + percent
                    + "], beginPos = [" + beginPos + "], endPos = [" + endPos + "], info = [" + info + "]");
        }

        @Override
        public void onSpeakPaused() {
            Log.e(TAG, "onSpeakPaused() called");
        }

        @Override
        public void onSpeakResumed() {
            Log.e(TAG, "onSpeakResumed() called");
        }

        @Override
        public void onSpeakProgress(int percent, int beginPos, int endPos) {
            Log.e(TAG, "onSpeakProgress() called with: percent = [" + percent
                    + "], beginPos = [" + beginPos + "], endPos = [" + endPos + "]");
        }

        @Override
        public void onCompleted(SpeechError speechError) {
            Log.e(TAG, "onCompleted() called with: speechError = [" + speechError + "], wavPath = [" + mWavPath + "]");
            File wavFile = new File(mWavPath);
            if (wavFile.exists()) {
                try {
                    byte[] audio = FileUtils.readBytesFromFile(wavFile);
                    FUParams params = new FUParams()
                            .setStreamMode(0)
                            .setAudioData(audio)
                            .setAudioType(FUAudioType.WAV)
                            .setAudioProgressType(FUAudioProgressType.AUDIO_SINGLE)
                            .setTimestampType(FUTimestampType.PHONE);
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
        public void onEvent(int eventType, int arg1, int arg2, Bundle obj) {
//            logger.verbose("onEvent() called with: eventType = [" + eventType
//                    + "], arg1 = [" + arg1 + "], arg2 = [" + arg2 + "], obj = [" + obj + "]");

            // 以下代码用于获取与云端的会话id，当业务出错时将会话id提供给技术支持人员，可用于查询会话日志，定位出错原因
            // 若使用本地能力，会话id为null
//            if (SpeechEvent.EVENT_SESSION_ID == eventType) {
//                String sid = obj.getString(SpeechEvent.KEY_EVENT_SESSION_ID);
//                Log.d(TAG, "session id =" + sid);
//            }

//            if (SpeechEvent.EVENT_TTS_BUFFER == eventType) {
//                byte[] buf = obj.getByteArray(SpeechEvent.KEY_EVENT_TTS_BUFFER);
//                Log.e(TAG, "buf is =" + buf);
//            }
        }
    }

}
