package com.lilosoft.virtualrobot.fragment;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.faceunity.AnimationStateListener;
import com.faceunity.FUParams;
import com.faceunity.fuenum.FUAudioProgressType;
import com.faceunity.fuenum.FUAudioType;
import com.faceunity.fuenum.FUTimestampType;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SynthesizerListener;
import com.lilosoft.virtualrobot.Constant;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.activity.DemoActivity;
import com.lilosoft.virtualrobot.activity.MainActivity;
import com.lilosoft.virtualrobot.adapter.ChatAdapter;
import com.lilosoft.virtualrobot.base.BaseFragment;
import com.lilosoft.virtualrobot.bean.CharBean;
import com.lilosoft.virtualrobot.bean.ChatBean;
import com.lilosoft.virtualrobot.bean.InitializeBean;
import com.lilosoft.virtualrobot.net.result.RetrofitRequest;
import com.lilosoft.virtualrobot.tts.XunfeiTtsHandler;
import com.lilosoft.virtualrobot.utils.ActivityManageUtil;
import com.lilosoft.virtualrobot.utils.FileUtils;
import com.lilosoft.virtualrobot.utils.StaUnityUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

/**
 * 聊天
 * 1.问的问题
 * 2.不知道的答案
 * 3.沒有問題的答案
 * 4.读合成的时候 不说欢迎语
 */
public class ChatFragment extends BaseFragment {

    private static final String TAG = "ChatFragment";
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(R.id.tv_listener)
    TextView mTv_listener;
    @BindView(R.id.iat_text)
    public EditText mResultText;
    @BindView(R.id.gif_speak)
    GifImageView mGifSpeak;

    private int speakNum = 0;
    private final static int ERROR_BACK_HOME = 1;
    private String AreaCode = "";
    MainActivity mMainActivity;
    private int ErrorNum = 0;
    private ChatAdapter mChatAdapter;
    private GifDrawable mGifFromAssets;
    private String id, name, sex, greeting;
    private boolean isError = true;
    private ArrayList<InitializeBean.ObjBean.RobotBean.GreetingsBean> greetings;
    private Timer timer;

    @Override
    public void init(Bundle savedInstanceState, View view) {
        mMainActivity = (MainActivity) getActivity();
        timer = new Timer(true);
        id = getArguments().getString("id");
        name = getArguments().getString("name");
        sex = getArguments().getString("sex");
        greeting = getArguments().getString("greetings");
        Log.e(TAG, "init: " + id);
        AreaCode = Constant.getAREACODE();
        greetings = Constant.getGreetings();
        initRecyclerView();
        initStartGif();

        StringBuilder buffer = new StringBuilder();
        if (!TextUtils.isEmpty(greeting)) {
            buffer.append(greeting);
            StaUnityUtils.getInstance().getFUStaEngine().updateAnimationOnce("effect/cartoon_female/animation/STA_anim_kt_def_female_huishou.bundle", null);
            startRobotSpeaking(buffer.toString(), "", "", null);
            RecognizerListener();
        } else if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(sex)) {
            StaUnityUtils.getInstance().getFUStaEngine().updateAnimationOnce("effect/cartoon_female/animation/STA_anim_kt_def_female_huishou.bundle", new AnimationStateListener() {
                @Override
                public void onAnimationComplete() {
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            buffer.append("您好:").append(name.charAt(0)).append(sex).append(",").append(getRandomGreeting(greetings));
                            ((MainActivity) getActivity()).onFaceActionSelected();
                            ((MainActivity) (getActivity())).onActionSelected("effect/cartoon_female/animation/STA_anim_kt_def_female_dantanshou.bundle");
                            ((MainActivity) (getActivity())).showWebView(Constant.getFaceinfoWebUrl());//千人千面
                            startRobotSpeaking(buffer.toString(), "", "", null);
                            RecognizerListener();
                        }
                    });
                }
            });
        } else {
            buffer.append(getRandomGreeting(greetings));
            StaUnityUtils.getInstance().getFUStaEngine().updateAnimationOnce("effect/cartoon_female/animation/STA_anim_kt_def_female_huishou.bundle", null);
            startRobotSpeaking(buffer.toString(), "", "", null);
            RecognizerListener();
        }
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_chat;
    }

    TimerTask timerTask = new TimerTask() {
        public void run() {
            Message message = new Message();
            message.what = ERROR_BACK_HOME;
            mHandler.sendMessage(message);
        }
    };

    public String getRandomGreeting(List<InitializeBean.ObjBean.RobotBean.GreetingsBean> greetings) {
        String greeting = "您好，请问有什么可以帮您的？";
        if (greetings != null) {
            Random random = new Random();
            int index = random.nextInt(greetings.size());
            greeting = greetings.get(index).getContent();
        }
        return greeting;
    }

    public static ChatFragment newInstance(String areaCode) {
        Bundle args = new Bundle();
        args.putString(areaCode, areaCode);
        ChatFragment fragment = new ChatFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private void initStartGif() {
        try {
            mGifFromAssets = new GifDrawable(getActivity().getAssets(), "speak.gif");
            mGifSpeak.setImageDrawable(mGifFromAssets);
            mGifFromAssets.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 机器人说话
     *
     * @param msg
     */
    private void startRobotSpeaking(String msg, String question, String QRCode, List<String> questions) {
        CharBean charBean = new CharBean();
        charBean.setType(0);
        charBean.setMessage(msg);
        charBean.setQuestion(question);
        charBean.setQRCodeURL(QRCode);
        charBean.setQuestions(questions);
        mChatAdapter.addData(charBean);
        mRecyclerView.scrollToPosition(mChatAdapter.getItemCount() - 1);
        TtsListener(msg);
    }

    /**
     * 用户说话
     *
     * @param msg
     */
    private void showUserMsg(String msg) {
        CharBean charBean = new CharBean();
        charBean.setType(1);
        charBean.setMessage(msg);
        mChatAdapter.addData(charBean);
        mRecyclerView.scrollToPosition(mChatAdapter.getItemCount() - 1);
    }

    private void initRecyclerView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        mChatAdapter = new ChatAdapter(new ArrayList<>(), getContext());
        mRecyclerView.setAdapter(mChatAdapter);
        mChatAdapter.setListener(new ChatAdapter.ChatAdapterListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onQuestionClick(String question) {
                mTv_listener.setTextColor(Color.WHITE);
                mTv_listener.setText(question);
                getChat(question);
                Log.e(TAG, "onQuestionClick: " + question);
            }
        });
    }

    /**
     * 合成回调监听。
     */

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
            if (wavFile.exists()) {
                try {
                    byte[] audio = FileUtils.readBytesFromFile(wavFile);
                    FUParams params = new FUParams()
                            .setStreamMode(0)
                            .setAudioData(audio)
                            .setAudioType(FUAudioType.WAV)
                            .setTimestamp("2.9570026 3.109003")
//                            .setAudioProgressType(FUAudioProgressType.AUDIO_SINGLE)
//                            .setAlignText("星采用多星组网模式")
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


    private SynthesizerListener mTtsListener = new SynthesizerListener() {

        @Override
        public void onSpeakBegin() {
            ActivityManageUtil.isSpeaking = true;
            //开始拾音
            Log.e(TAG, "开始播放：");
        }

        @Override
        public void onSpeakPaused() {
            Log.e(TAG, "暂停播放：");
        }

        @Override
        public void onSpeakResumed() {
            Log.e(TAG, "继续播放：");
        }

        @Override
        public void onBufferProgress(int percent, int beginPos, int endPos, String info) {
            // 合成进度
            Log.e(TAG, "合成进度: percent =" + percent);
        }

        @Override
        public void onSpeakProgress(int percent, int beginPos, int endPos) {
            // 播放进度
        }

        @Override
        public void onCompleted(SpeechError error) {
            Log.e(TAG, "onCompleted: " + error);
            if (error == null) {
                Log.e(TAG, "播放完成: ");
                ActivityManageUtil.isSpeaking = false;
            }
        }

        @Override
        public void onEvent(int eventType, int arg1, int arg2, Bundle obj) {
            //	 以下代码用于获取与云端的会话id，当业务出错时将会话id提供给技术支持人员，可用于查询会话日志，定位出错原因
            //	 若使用本地能力，会话id为null
        }
    };

    //合成回调监听。
    public void TtsListener(String msg) {
        mTts.startSpeaking(msg, mTtsListener);
//        StaUnityUtils.getInstance().getFUStaEngine().stopMediaPlayer();
//        mTts.synthesizeToUri(msg, mWavPath, new SpeechListener());
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void getChat(String query) {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("userId", id);
        paramMap.put("query", query);
        paramMap.put("areaCode", AreaCode);
        paramMap.put("serviceId", Constant.serviceId);
//        http://123.56.141.248:8081/botservice/api/bot/chat
//        Constant.getBase_URL() + "botservice/api/bot/chat"
        RetrofitRequest.sendPostRequest("http://123.56.141.248:8081/botservice/api/bot/chat", paramMap, ChatBean.class, new RetrofitRequest.ResultHandler<ChatBean>((getActivity())) {

            @Override
            public void onBeforeResult() {
            }

            @Override
            public void onResult(ChatBean chatBean) {
                if (chatBean.isSuccess()) {
                    if (mResultText != null) {
                        mResultText.setText(null);
                    }
//                    if (mTts.isSpeaking()) {
//                        mTts.stopSpeaking();
//                    }
//                    ActivityManageUtil.getInstance().setAutoComeBack(false);
                    String type = chatBean.getData().getType();//类型
                    String reply = chatBean.getData().getReply();//答案
                    String query = chatBean.getData().getQuery();//问题
                    String reply_voice = chatBean.getData().getReply();//读的答案
                    ChatBean.DataBean.SlotBean slot = chatBean.getData().getSlot();
                    String file_url = null;
                    String web_url = null;
                    if (slot != null) {
                        file_url = slot.getFile_url();//二维码
                        if (slot.getRelation() > 0) {
                            file_url = Constant.RobotURL + "faqDetail?id=" + slot.getId();
                            Log.e(TAG, "file_url " + file_url);
                        }
                        web_url = slot.getWeb_url();//第三方应用网页
                    }
                    if (TextUtils.isEmpty(reply_voice)) {
                        reply_voice = reply;
                    }
                    switch (type) {
                        case "chat":
//                            mMainActivity.mBannerLayout.setVisibility(View.VISIBLE);
//                            mMainActivity.mFrameLayoutWebView.setVisibility(View.GONE);
//                            showUserMsg(query);
//                            TtsListener(reply_voice);
//                            startRobotSpeaking(reply_voice, query, null, null);
                            break;
                        case "satisfy":
                            if (!TextUtils.isEmpty(web_url)) {
                                ((MainActivity) Objects.requireNonNull(getActivity())).showWebView(web_url);
                                ((MainActivity) (getActivity())).onActionSelected("effect/cartoon_female/animation/STA_anim_kt_def_female_dantanshou.bundle");
                            } else {
                                mMainActivity.mBannerLayout.setVisibility(View.VISIBLE);
//                                ((MainActivity) getActivity()).closeWebDialog();
                                mMainActivity.mFrameLayoutWebView.setVisibility(View.GONE);
                            }
                            startRobotSpeaking(reply_voice, query, file_url, chatBean.getData().getOptions());
                            break;
                        case "clarify":
                            if (chatBean.getData().getAnswers() != null && chatBean.getData().getAnswers().size() > 0) {
                                startRobotSpeaking(reply_voice, query, file_url, chatBean.getData().getAnswers());
                            } else {
                                startRobotSpeaking(reply_voice, query, file_url, chatBean.getData().getAnswers());
                            }
                            mMainActivity.mBannerLayout.setVisibility(View.VISIBLE);
                            mMainActivity.mFrameLayoutWebView.setVisibility(View.GONE);
                            break;
                        case "failure":
                            questionFailed(reply);
                            resumeSpeaking();
//                            mMainActivity.mBannerLayout.setVisibility(View.VISIBLE);
//                            mMainActivity.mFrameLayoutWebView.setVisibility(View.GONE);
//                            startRobotSpeaking(reply, "", null, null);
                            break;
                        case "select":
                            mMainActivity.mBannerLayout.setVisibility(View.VISIBLE);
                            mMainActivity.mFrameLayoutWebView.setVisibility(View.GONE);
                            startRobotSpeaking(reply_voice, query, file_url, chatBean.getData().getOptions());
                            break;
                        case "event":
                            if (reply.equals("quit")) {
                                stopSpeaking();
                                ((MainActivity) getActivity()).closeWebDialog();
                                mMainActivity.mBannerLayout.setVisibility(View.VISIBLE);
                                mMainActivity.mFrameLayoutWebView.setVisibility(View.GONE);
//                                ((MainActivity) Objects.requireNonNull(getActivity())).showWake();
//                                ((MainActivity) Objects.requireNonNull(getActivity())).showSNDH();
                                startRobotSpeaking("好的", query, file_url, null);
                                ((MainActivity) getActivity()).onWebBackBaseActionSelected();
                                //人物复原 todo
                            } else if (reply.equals("project")) {
                                String projectWebUrl = Constant.getProjectWebUrl();
                                if (TextUtils.isEmpty(projectWebUrl)) {
                                    ((MainActivity) Objects.requireNonNull(getActivity())).showWebView(projectWebUrl);
                                    ((MainActivity) (getActivity())).onActionSelected("effect/cartoon_female/animation/STA_anim_kt_def_female_dantanshou.bundle");
                                }
                            } else {
                                String eventWebUrl = Constant.getEventWebUrl();
                                if (!TextUtils.isEmpty(eventWebUrl)) {
                                    ((MainActivity) Objects.requireNonNull(getActivity())).showWebView(eventWebUrl);
                                    ((MainActivity) (getActivity())).onActionSelected("effect/cartoon_female/animation/STA_anim_kt_def_female_dantanshou.bundle");
                                }
//                                startRobotSpeaking(reply, query, file_url, null);
                            }
                            break;
                    }
                } else {
                    if (mResultText != null) {
                        mResultText.setText(null);
                    }
                    questionFailed("我不知道您的问题!");
                }
            }

            @Override
            public void onAfterFailure() {
                if (mResultText != null) {
                    mResultText.setText(null);
                }
                questionFailed("我不知道您的问题");
            }
        });
    }


    public void questionFailed(String reply) {
        if (mTv_listener != null) {
            mTv_listener.setText(reply);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                mTv_listener.setTextColor(Objects.requireNonNull(getContext()).getColor(R.color.red));
            } else {
                mTv_listener.setTextColor(Objects.requireNonNull(getContext()).getResources().getColor(R.color.red));
            }
            mTv_listener.setAnimation(shakeAnimation(4));
        }
    }

    @SuppressLint("HandlerLeak")
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case ERROR_BACK_HOME:
                    String randomGreeting = getRandomGreeting(greetings);
                    mTv_listener.setTextColor(Color.WHITE);
                    mTv_listener.setText(randomGreeting);
                    TtsListener(randomGreeting);
                    break;
            }
        }
    };

    //听写监听器。
    public void RecognizerListener() {
        mIat.startListening(this);
    }

    @Override
    public void onVolumeChanged(int volume, byte[] bytes) {
    }

    @Override
    public void onBeginOfSpeech() {
        mGifFromAssets.start();
        resumeSpeaking();
        Log.e(TAG, "onBeginOfSpeech: ");
    }

    @Override
    public void onEndOfSpeech() {
        mGifFromAssets.stop();
        resumeSpeaking();
//        stopSpeechRecognizerVoice();
//        ActivityManageUtil.isSpeaking = false;
        Log.e(TAG, "onEndOfSpeech: ");
        // 此回调表示：检测到了语音的尾端点，已经进入识别过程，不再接受语音输入
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onResult(RecognizerResult recognizerResult, boolean b) {
        Log.e(TAG, "recognizerResult: " + recognizerResult.getResultString());
        if (mResultText != null) {
            ErrorNum = 0;
            mResultText.append(recognizerResult.getResultString());
            String context = mResultText.getText().toString();
            if (b) {
                Log.e(TAG, context);
                //有说话 调接口 停止说话
                SetDateEmpty(mTv_listener, context);
                RecognizerListener();
                getChat(context);
            }
        }
    }

    @Override
    public void onError(SpeechError speechError) {
        // Tips：
        // 错误码：10118(您没有说话)，可能是录音机权限被禁，需要提示用户打开应用的录音权限。
        Log.e(TAG, "onError: " + speechError.getPlainDescription(true));
//        if (isError) {
//            timer.schedule(timerTask, 1000, 1000); //延时1000ms后执行，1000ms执行一次
//        }
        ErrorNum++;
        Log.i(TAG, "ErrorNum:" + ErrorNum);
        if (ErrorNum == 4) {//15秒提示语
            String randomGreeting = getRandomGreeting(greetings);
            if (mTts.isSpeaking()) {
                ErrorNum = 0;
            } else {
                if (mTv_listener != null) {
                    mTv_listener.setTextColor(Color.WHITE);
                    mTv_listener.setText(randomGreeting);
                    TtsListener(randomGreeting);
                    ErrorNum = 0;
                }
            }
        }
        RecognizerListener();
    }

    @Override
    public void onEvent(int i, int i1, int i2, Bundle bundle) {
        // 以下代码用于获取与云端的会话id，当业务出错时将会话id提供给技术支持人员，可用于查询会话日志，定位出错原因
        // 若使用本地能力，会话id为null
        //	if (SpeechEvent.EVENT_SESSION_ID == eventType) {
        //		String sid = obj.getString(SpeechEvent.KEY_EVENT_SESSION_ID);
        //		Log.d(TAG, "session id =" + sid);
        //	}
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (null != mIat) {
            // 退出时释放连接
            mIat.cancel();
            mIat.destroy();
        }
        release();
        if (mGifFromAssets != null) {
            mGifFromAssets.recycle();
        }

        if (mResultText != null) {
            mResultText.setText(null);
        }
    }
}
