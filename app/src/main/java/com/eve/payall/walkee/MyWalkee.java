package com.eve.payall.walkee;

import android.app.Application;

import com.facebook.FacebookSdk;

public class MyWalkee extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.setApplicationId("123");

        FacebookSdk.sdkInitialize(this);
    }
}
