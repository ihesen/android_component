package com.ihesen.think;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * application
 *
 * @author hesen
 * @version 1.0
 * @since 2018/4/28
 */
public class AppApplication extends Application {

    private static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        initARouter();
    }

    private void initARouter() {
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }

    public static Application getApplication() {
        return application;
    }
}
