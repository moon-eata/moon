package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Window;

public class notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        statusBarColor();
    }
    private void statusBarColor() {
        Window window = notification.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(notification.this,R.color.orange_light));
    }
}