package com.lilosoft.virtualrobot.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import com.lilosoft.virtualrobot.activity.MainActivity;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class ActivityManageUtil {

    private static final String TAG = "ActivityManageUtil";
    private static ActivityManageUtil instance;
    private static Stack<Activity> activityStack;
    /**
     * 定时自动回退到首页
     */
    private boolean isAutoComeBack = false;
    public static boolean isSpeaking = false;
    public final static int timeCount = 60;
    public final static int timeSpan = 5;
    private static int time;

    public boolean isAutoComeBack() {
        return isAutoComeBack;
    }

    public void setAutoComeBack(boolean autoComeBack) {
        isAutoComeBack = autoComeBack;
    }


    public static ActivityManageUtil getInstance() {
        if (instance == null) {
            instance = new ActivityManageUtil();
        }
        return instance;
    }

    public void addActivity(Activity activity) {
        if (activityStack == null) {
            activityStack = new Stack<>();
        }
        activityStack.add(activity);
    }

    /**
     * 结束最后一个activity
     */
    public void finishActivity() {
        Activity activity = activityStack.lastElement();
        activity.finish();
    }

    /**
     * 结束指定activity
     *
     * @param activity
     */
    public void finishActivity(Activity activity) {
        if (activity != null) {
            activityStack.remove(activity);
            activity.finish();
        }
    }

    public void finishActivity(Class<?> cls) {
        for (Activity activity : activityStack) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
            }
        }
    }

    /**
     * 结束所有Activity
     */
    public void finishAllActivity() {
        for (int i = 0; i < activityStack.size(); i++) {
            if (null != activityStack.get(i)) {
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
    }

    /**
     * 只保留MainActivity
     */
    public void goBackMainActivity() {
        MainActivity activity = null;
        for (int i = 0; i < activityStack.size(); i++) {
            if (null != activityStack.get(i)) {
                if (!activityStack.get(i).getClass().equals(MainActivity.class)) {
                    activityStack.get(i).finish();
                } else {
                    activity = (MainActivity) activityStack.get(i);
                }
            }
        }
        if (activity != null) {
//            activity.showWake();
            activity.showSNDH();
        }
    }

    /**
     * 获取当前activity 最后一个压入的
     *
     * @return
     */
    public Activity currentActivity() {
        Activity activity = activityStack.lastElement();
        return activity;
    }

    /**
     * 退出应用程序
     */
    public void appExit(Context context) {
        try {
            finishAllActivity();
            ActivityManager activityMgr = (ActivityManager) context
                    .getSystemService(Context.ACTIVITY_SERVICE);
            activityMgr.killBackgroundProcesses(context.getPackageName());
            System.exit(0);
        } catch (Exception e) {

        }
    }

    @SuppressLint("CheckResult")
    public void startActivityTimer() {
        resetTime();
        Observable.interval(timeSpan, TimeUnit.SECONDS)
                .observeOn(Schedulers.io())
                .doOnNext(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        time = time - timeSpan;
                        Log.e(TAG, "accept: " + time);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(Long aLong) throws Exception {
                        if (time <= 0) {
                            resetTime();
                            if (isAutoComeBack && !isSpeaking) {
                                ActivityManageUtil.getInstance().setAutoComeBack(false);
                                goBackMainActivity();
                            }
                        }
                    }
                });
    }

    private void resetTime() {
        time = timeCount;
    }
}
