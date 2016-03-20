package com.jason9075.androidttdplayground;

import android.app.Application;

import com.jason9075.androidttdplayground.module.NetworkModule;

/**
 * Created by jason9075 on 2016/3/18.
 */
public class TtdApplication extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .networkModule(new NetworkModule())
                .build();
    }

    public static AppComponent getComponent() {
        return appComponent;
    }
}
