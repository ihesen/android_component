package com.ihesen.think.one.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.ihesen.think.service.route.OneRoute;

import think.ihesen.com.component_one.R;

@Route(path = OneRoute.MAIN_ACTIIVTY)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_activity_main);
    }
}
