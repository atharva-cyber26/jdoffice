package com.example.jdoffice;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                MainActivity.this.startActivity(new Intent(MainActivity.this, Activity2.class));
                MainActivity.this.finish();
            }
        }, (long) SPLASH_TIME_OUT);
    }
}
