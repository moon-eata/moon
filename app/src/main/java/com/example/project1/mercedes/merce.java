package com.example.project1.mercedes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.Window;

import com.example.project1.R;
import com.example.project1.renault;

public class merce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merce);
        statusBarColor();
    }
    private void statusBarColor() {
        Window window = merce.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(merce.this,R.color.orange_light));
    }
}