package com.ihesen.think;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.ihesen.think.service.route.OneRoute;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        ARouter.getInstance().build(OneRoute.MAIN_ACTIIVTY).navigation();
    }

    @OnClick({R.id.tv_open_component_one})
    public void openComponentOneMainPage() {
        ARouter.getInstance().build(OneRoute.MAIN_ACTIIVTY).navigation();
    }

}
