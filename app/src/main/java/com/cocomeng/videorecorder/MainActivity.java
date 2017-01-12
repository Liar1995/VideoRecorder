package com.cocomeng.videorecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Sunmeng Data:2016年12月30日
 * E-Mail:Sunmeng1995@outlook.com
 * Description:小视频录制
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CameraActivity.startActivity(MainActivity.this);
            }
        });
    }
}
