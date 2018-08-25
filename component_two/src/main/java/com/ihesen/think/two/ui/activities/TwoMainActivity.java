package com.ihesen.think.two.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ihesen.think.service.route.IRoute;
import com.ihesen.think.two.R;

@Route(path = IRoute.TwoRoute.MAIN_ACTIIVTY)
public class TwoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity_main);
    }
}
