package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button btn ;
     private int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setText("Click me");

    }

    public void go(View view)
    {
        count++;
        btn.setText("This is a click number: "+count);
        if (count%7==0){
            btn.setText("Boom!!!");
        }
    }
}