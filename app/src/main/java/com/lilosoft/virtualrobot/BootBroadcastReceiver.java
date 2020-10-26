package com.lilosoft.virtualrobot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.lilosoft.virtualrobot.activity.InitActivity;

import java.util.Objects;

public class BootBroadcastReceiver extends BroadcastReceiver {

    static final String ACTION = "android.intent.action.BOOT_COMPLETED";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), ACTION)) {
            Intent mainActivityIntent = new Intent(context, InitActivity.class); // 要启动的Activity
            mainActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mainActivityIntent);
        }
    }
}
