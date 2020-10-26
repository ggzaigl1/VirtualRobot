package com.lilosoft.virtualrobot.utils;

import android.util.Log;

/**
 * Created by hehuan on 2016/12/19.
 */

public class TestLog {

    private final static boolean isShow = true;

    public static void d(String tag, String msg) {
        if (isShow) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (isShow) {
            Log.e(tag, msg);
        }
    }
}
