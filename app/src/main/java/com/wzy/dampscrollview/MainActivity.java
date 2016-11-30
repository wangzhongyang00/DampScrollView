package com.wzy.dampscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    DampView dampView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dampView = (DampView) findViewById(R.id.dv);
        imageView = (ImageView) findViewById(R.id.iv_pic_bg);
        dampView.setImageView(imageView);
    }
}
