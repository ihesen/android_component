package com.ihesen.think;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.ihesen.think.service.route.IRoute;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.btn_open_component_one})
    public void openComponentOneMainPage() {
        ARouter.getInstance().build(IRoute.OneRoute.MAIN_ACTIIVTY).navigation();
    }

}
