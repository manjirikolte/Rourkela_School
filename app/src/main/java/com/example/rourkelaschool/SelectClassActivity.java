package com.example.rourkelaschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_class);
    }
    public void selected_classbtn(View view){
        Intent intent = new Intent(SelectClassActivity.this,OptionsActivity.class);
        startActivity(intent);
    }

}
