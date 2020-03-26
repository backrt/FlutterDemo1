package com.dangbei.lerad.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public class FirstActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitst);

        Button button = findViewById(R.id.activity_first_bt);
        button.setFocusable(true);
        // activityWithFragment / myFlutterActivity
        button.setOnClickListener(it -> {

            Intent intent = new Intent(this, CombineActivityWithView.class);
            intent.putExtra("initial_route", "router_main");
            startActivity(intent);
        });
    }
}
