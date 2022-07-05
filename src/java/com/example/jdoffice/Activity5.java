package com.example.jdoffice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    public void onclick(View view) {
        if (view.getId() == R.id.b1) {
            startActivity(new Intent(this, Activity7.class));
        }
        if (view.getId() == R.id.b2) {
            startActivity(new Intent(this, Activity8.class));
        }
        if (view.getId() == R.id.b3) {
            startActivity(new Intent(this, Activity9.class));
        }
        if (view.getId() == R.id.b4) {
            startActivity(new Intent(this, Activity10.class));
        }
    }
}
