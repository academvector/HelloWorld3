package com.example.aleksander.helloworld3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView mTextView;
    private Button mYellowCounter;
    private int mCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mYellowCounter = findViewById(R.id.button_counter);
        mYellowCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText("Куку " + mCount++ + " епта");
            }
        });
    }

    public void onClick(View view) {
        mTextView = findViewById(R.id.textView);
        mTextView.setText("Alarma! Расчехляеся!");
    }

    public void onClickKar(View view) {
        mTextView = findViewById(R.id.textView);
        mTextView.setText("Я твой дед");
    }
}
