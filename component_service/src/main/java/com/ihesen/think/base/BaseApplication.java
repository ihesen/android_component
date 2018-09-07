package com.ihesen.think.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * createTime: 2018/9/7
 * auth: hesen
 * description:
 */
public class BaseApplication extends Application {

    private static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        init();
    }

    private void init() {
        initARouter();
    }

    private void initARouter() {
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }

    public static Application getApplication() {
        return application;
    }
}
