package com.example.chenwenping.mydagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Inject
    DaggerPresenter mDaggerPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.text);

    }

    public void showUserName(String name){
        mTextView.setText(name);
    }
}
