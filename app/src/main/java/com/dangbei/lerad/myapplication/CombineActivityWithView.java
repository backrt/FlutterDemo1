package com.dangbei.lerad.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;

public class CombineActivityWithView extends FragmentActivity {

    private FlutterEngine flutterEngine;
    private FlutterView flutterView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flutter);
        this.attachFlutterWithView();
    }

    /**
     * 以下是以android View的形式接入
     */
    void attachFlutterWithView() {

        // 通过FlutterView引入Flutter编写的页面
        flutterView = new FlutterView(this);
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        FrameLayout flContainer = findViewById(R.id.demo_container);
        flContainer.addView(flutterView, lp);


        flutterEngine = new FlutterEngine(this);
        flutterEngine
                .getDartExecutor()
                .executeDartEntrypoint(
                        DartExecutor.DartEntrypoint.createDefault()
                )
        ;
        flutterEngine.getNavigationChannel().setInitialRoute("router_main");
        // 关键代码，将Flutter页面显示到FlutterView中
        flutterView.attachToFlutterEngine(flutterEngine);


        Log.d("lhb", "init router = ");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        flutterView.detachFromFlutterEngine();
    }
}
