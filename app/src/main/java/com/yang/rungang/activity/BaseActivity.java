package com.yang.rungang.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/**
 * 基Activity
 * Created by 洋 on 2016/4/22.
 */
public class BaseActivity extends Activity{

    public Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=getApplicationContext();

    }
}
