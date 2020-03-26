package com.dangbei.lerad.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;

import io.flutter.embedding.android.FlutterFragmentActivity;

public class ActivityWithFragment extends FlutterFragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_flutter);
//        this.attachFlutterWithFragment();

//        getFlutterEngine()
//                .getNavigationChannel()
//                .setInitialRoute("router_main");
    }


//    /**
//     * 以fargment的形式 引入到Android
//     */
//    void attachFlutterWithFragment() {
//        // 通过FlutterFragment引入Flutter编写的页面
//        FlutterFragment flutterFragment = FlutterFragment.createDefault();
//        FlutterFra
//
//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.demo_activity_container, flutterFragment)
//                .commit();
//    }

}
