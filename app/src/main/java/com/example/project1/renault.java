package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Window;

public class renault extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renault);
        statusBarColor();
    }
    private void statusBarColor() {
        Window window = renault.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(renault.this,R.color.orange_light));
    }
}