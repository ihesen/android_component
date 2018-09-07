package com.ihesen.think.one.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.ihesen.think.one.R;
import com.ihesen.think.one.R2;
import com.ihesen.think.service.route.IRoute;

import butterknife.ButterKnife;
import butterknife.OnClick;


@Route(path = IRoute.OneRoute.MAIN_ACTIIVTY)
public class OneMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.tv_one_component})
    public void openPage(){
        Bundle bundle = new Bundle();
        bundle.putString("testKey","testValue");
        ARouter.getInstance().build(IRoute.TwoRoute.MAIN_ACTIIVTY).with(bundle).navigation();
//        ARouter.getInstance().build(IRoute.TwoRoute.MAIN_ACTIIVTY).navigation();
    }
}
