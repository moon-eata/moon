package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Window;

public class volksPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volks_page);
        statusBarColor();
    }
    private void statusBarColor() {
        Window window = volksPage.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(volksPage.this,R.color.orange_light));
    }
}