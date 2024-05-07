package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Window;

public class peugeot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peugeot);
        statusBarColor();
    }
    private void statusBarColor() {
        Window window = peugeot.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(peugeot.this,R.color.orange_light));
}
}