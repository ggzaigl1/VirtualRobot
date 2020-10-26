package com.lilosoft.virtualrobot.base;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.faceunity.AnimationStateListener;
import com.lilosoft.virtualrobot.Constant;
import com.lilosoft.virtualrobot.MyApplication;
import com.lilosoft.virtualrobot.entity.Effect;
import com.lilosoft.virtualrobot.utils.ActivityManageUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseActivity extends AppCompatActivity {

    protected String TAG = this.getClass().getSimpleName();
    public final static String filepath = Environment.getExternalStorageDirectory().toString() + Constant.LogFile;
    protected BaseActivity mActivity;
    protected MyApplication mMyApplication;
    private Unbinder mUnbinder;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hiddenNavigationBar(true);
        setContentView(getContentViewResId());
        setNavigationBarVisible(this, true);
        mUnbinder = ButterKnife.bind(this);
        initView(savedInstanceState);
        ActivityManageUtil.getInstance().addActivity(this);
        mActivity = this;
        mMyApplication = (MyApplication) MyApplication.get();
    }

    public abstract int getContentViewResId();

    /**
     * @param savedInstanceState
     */
    public abstract void initView(@Nullable Bundle savedInstanceState);

    public void setNavigationBarVisible(Activity activity, boolean isHide) {
        if (isHide) {
            View decorView = activity.getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        } else {
            View decorView = activity.getWindow().getDecorView();
            int uiOptions = View.SYSTEM_UI_FLAG_VISIBLE;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }


    /**
     * 隐藏pad底部虚拟键
     *
     * @param isShow
     */
    public void hiddenNavigationBar(boolean isShow) {
        if (isShow) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window _window = getWindow();
                WindowManager.LayoutParams params = _window.getAttributes();
                params.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE;
                _window.setAttributes(params);
            }
        }
    }


    public void ToastMessage(String message) {
        Toast.makeText(mActivity, message, Toast.LENGTH_SHORT).show();
    }
    /**
     * 是否按照宽度进行等比例适配 (为了保证在高宽比不同的屏幕上也能正常适配, 所以只能在宽度和高度之中选择一个作为基准进行适配)
     *
     * @return {@code true} 为按照宽度进行适配, {@code false} 为按照高度进行适配
     */
//    @Override
//    public boolean isBaseOnWidth() {
//        return true;
//    }

    /**
     * 这里使用 iPhone 的设计图, iPhone 的设计图尺寸为 750px * 1334px, 高换算成 dp 为 667 (1334px / 2 = 667dp)
     * <p>
     * 返回设计图上的设计尺寸, 单位 dp
     * {@link #getSizeInDp} 须配合 {@link #isBaseOnWidth()} 使用, 规则如下:
     * 如果 {@link #isBaseOnWidth()} 返回 {@code true}, {@link #getSizeInDp} 则应该返回设计图的总宽度
     * 如果 {@link #isBaseOnWidth()} 返回 {@code false}, {@link #getSizeInDp} 则应该返回设计图的总高度
     * 如果您不需要自定义设计图上的设计尺寸, 想继续使用在 AndroidManifest 中填写的设计图尺寸, {@link #getSizeInDp} 则返回 {@code 0}
     *
     * @return 设计图上的设计尺寸, 单位 dp
     */
//    public float getSizeInDp() {
//        return 0;
//    }
}
