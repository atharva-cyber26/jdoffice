package com.example.jdoffice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void onclick(View view) {
        if (view.getId() == R.id.b1) {
            startActivity(new Intent(this, Activity3.class));
        }
        if (view.getId() == R.id.b2) {
            startActivity(new Intent(this, Activity4.class));
        }
        if (view.getId() == R.id.b3) {
            startActivity(new Intent(this, Activity5.class));
        }
        if (view.getId() == R.id.b4) {
            startActivity(new Intent(this, Activity6.class));
        }
        if (view.getId() == R.id.b5) {
            startActivity(new Intent(this, Activity11.class));
        }
        if (view.getId() == R.id.b6) {
            startActivity(new Intent(this, Activity12.class));
        }
    }
}
