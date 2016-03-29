package com.tenstep.application;

import android.content.Context;

import com.baidu.frontia.FrontiaApplication;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by Administrator on 2016-1-8 0008.
 */
public class DemoApplication extends FrontiaApplication {

    private static DemoApplication mInstance = null;

    public static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance=this;
        // 在使用 SDK 各组间之前初始化 context 信息，传入 ApplicationContext
        SDKInitializer.initialize(this);
    }
}
