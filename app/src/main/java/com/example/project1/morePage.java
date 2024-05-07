package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class morePage extends AppCompatActivity {
Button volks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_page);
        statusBarColor();

    }
    private void bottomNavigation(){
        volks=(Button) findViewById(R.id.volks);
    }
    public void onclick2 (View view){
        Intent volks = new Intent(this, volksPage.class);
        startActivity(volks);
    }
    private void statusBarColor() {
        Window window = morePage.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(morePage.this,R.color.orange_light));
    }
}