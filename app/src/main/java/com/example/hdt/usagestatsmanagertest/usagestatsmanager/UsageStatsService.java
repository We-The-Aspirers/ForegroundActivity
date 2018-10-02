package com.example.hdt.usagestatsmanagertest.usagestatsmanager;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.example.hdt.usagestatsmanagertest.Utils;

public class UsageStatsService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Utils.getForegroundProcess(UsageStatsService.this);
            }
        }, 5000);
        return START_STICKY;
    }
}
