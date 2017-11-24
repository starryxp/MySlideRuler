package com.xiaopeng.myslideruler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by xiaopeng on 2017/9/19.
 */
public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private SlideRulerView slideRulerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        slideRulerView = findViewById(R.id.slideruler);

        slideRulerView.setMaxValue(10000);
        slideRulerView.setMinCurrentValue(0);
        slideRulerView.setCurrentValue(100);
        slideRulerView.setSlideRulerDataInterface(new SlideRulerDataInterface() {
            @Override
            public void getText(String data) {
                textView.setText(data);
            }
        });

    }

}
