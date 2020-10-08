package com.stockchamps.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.stockchamps.R;
import com.stockchamps.healper.ViewUtils;

public class Splash extends AppCompatActivity {

    public ViewUtils viewUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        viewUtils = new ViewUtils(this);
        viewUtils.statusbar_color();
        splash();

    }

    public void splash() {

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(Splash.this,LoginProcessActivity.class));
                    finish();
                }
            }
        };
        timerThread.start();
    }

}
