package com.bignerdranch.android.activivity_and_fragment_refresher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Avinash.Ganga on 04/04/17.
 */

public class Activity2 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "ACT2_TEXT_EXTRA";
    private EditText mEditText;
    private Button mButton;


    public static Intent newIntent(Context packageContext, String text) {
        Intent i = new Intent(packageContext, Activity2.class);
        i.putExtra(EXTRA_TEXT, text);
        return i;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        mEditText = (EditText) findViewById(R.id.activity2_textbox);
        String s = getIntent().getStringExtra(EXTRA_TEXT);
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
        mEditText.setText(getIntent().getStringExtra(EXTRA_TEXT));




    }
}
