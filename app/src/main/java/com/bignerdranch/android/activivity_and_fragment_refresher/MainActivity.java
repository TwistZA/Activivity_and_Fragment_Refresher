package com.bignerdranch.android.activivity_and_fragment_refresher;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mText1;
    private Button mButton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText1 = (EditText) findViewById(R.id.activity1_textbox);



        mButton1 = (Button) findViewById(R.id.activity1_button);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = mText1.toString();
                String s2 = mText1.getText().toString();
                Intent i= Activity2.newIntent(MainActivity.this,s2);
                startActivity(i);
            }
        });
    }
}
