package com.lilosoft.virtualrobot.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.base.BaseActivity;
import com.lilosoft.virtualrobot.entity.Effect;

/**
 * pj
 */
public class WebViewActivity extends BaseActivity {

    private final int TIMER = 1;
    private boolean mTimerStop = false;
    private static final String TAG = "EvaluationPJWebActivity";
    private WebView webView;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String pjUrl = getIntent().getStringExtra("Url");
        webView = findViewById(R.id.web_view);
        Log.e(TAG, "onCreate: " + pjUrl);
        initView(pjUrl);
    }

    @Override
    public int getContentViewResId() {
        return R.layout.activity_webview;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {

    }

    @SuppressLint("SetJavaScriptEnabled")
    public void testJS() {
        webView.loadUrl("javascript:window.Sczy.onGoodBadEvaResult(int codeId)");
    }


    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initView(String url) {
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.setHorizontalScrollBarEnabled(false);//水平不显示
        webView.setVerticalScrollBarEnabled(false); //垂直不显示
        webView.loadUrl(url);
//        webView.loadUrl(Constant.getEvelURL() + "unlock/pages/PadEvaluation.html?takid=" + mTakid + "&caseid=" + mCaseid);
        // Enable Javascript
//        testJS();
        WebSettings webSettings = webView.getSettings();
        //设置WebView支持javascript脚本
        webSettings.setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);          //允许缩放
        webSettings.setBuiltInZoomControls(true);  //原网页基础上缩放
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.addJavascriptInterface(new JavaScriptInterface(this), "android");
        webSettings.setMixedContentMode(webSettings.getMixedContentMode());
        webView.setWebViewClient(new WebViewClient());
        mHandler.sendEmptyMessageDelayed(TIMER, 1000);
    }

    public static String encodeURI(String uri) {
        return Uri.encode(uri, ":/-![].,%?&=");
    }

    public void Reload(View view) {
        webView.reload();
    }

    public class JavaScriptInterface {
        Context mContext;

        JavaScriptInterface(Context context) {
            mContext = context;
        }

        //与js交互时用到的方法
        @JavascriptInterface
        public void toastMessage(final String evaluation) {
            Log.e("TAG", "传递过来的值是: " + evaluation);
            mTimerStop = true;
            UpEvaluation(evaluation);
        }

        @JavascriptInterface
        public void dissMessage() {
        }
    }


    private void UpEvaluation(String evaluation) {
//        mHandler.sendEmptyMessage(WEB);
    }


    @SuppressLint("HandlerLeak")
    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case TIMER:
                    if (!mTimerStop) {
                        mHandler.sendEmptyMessageDelayed(TIMER, 1000);
                    }
                    break;
                default:
                    break;
            }
        }
    };
}