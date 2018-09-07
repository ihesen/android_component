package com.ihesen.think.one.interceptor;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.ihesen.think.service.route.IRoute;

@Interceptor(priority = 1)
public class TestInterceptor implements IInterceptor {

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        Log.e("ihesen interceptor:", TestInterceptor.class.getName() + " has process.");
        //拦截跳转，进行一些处理
        if (postcard.getPath().equals(IRoute.TwoRoute.MAIN_ACTIIVTY)) {
            Log.e("ihesen interceptor:", TestInterceptor.class.getName() + " 进行了拦截处理！");
        }
        callback.onContinue(postcard);
    }

    @Override
    public void init(Context context) {
        Log.e("ihesen interceptor:", TestInterceptor.class.getName() + " has init.");
    }
}
