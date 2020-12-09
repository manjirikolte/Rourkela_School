package com.example.rourkelaschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

    }
    public void contactUsPage(View view){
        Intent intent = new Intent(OptionsActivity.this,ContactUsActivity.class);
        startActivity(intent);
    }
}
