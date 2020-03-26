package com.dangbei.lerad.myapplication;


import android.os.Bundle;
import android.util.Log;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MyFlutterActivity extends FlutterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String engineID = getCachedEngineId();
        Log.d("lhb",this.getClass().getName()+", engineID 1="+engineID);

        FlutterEngine engine = getFlutterEngine();
        Log.d("lhb",this.getClass().getName()+",engine = "+engine);

        String engineID2 = getCachedEngineId();
        Log.d("lhb",this.getClass().getName()+", engineID 2="+engineID2);

    }

}
