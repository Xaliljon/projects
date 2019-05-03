package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    Button logbtn;
    TextView regtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logbtn = findViewById(R.id.log_btn);
        regtv = findViewById(R.id.reg_tv);
        logbtn.setOnClickListener(this);
        regtv.setOnClickListener(this);

    }
    public void onClick(View v) {
        if (v.getId()==R.id.reg_tv){
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        } else if (v.getId()==R.id.log_btn){
            Intent intent = new Intent(this,WelcomeActivity.class);
            startActivity(intent);
        }
    }
}