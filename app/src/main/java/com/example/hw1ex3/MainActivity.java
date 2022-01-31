package com.example.hw1ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClick();


    }
    public void buttonClick()
    {
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener((view -> {

            TextView tv = findViewById(R.id.tv_1);
            String stringValue = tv.getText().toString();
            Integer originalValue = Integer.parseInt(stringValue);
            Integer newValue = MyHelper.IncrementMyValue(originalValue);
            tv.setText(newValue.toString());
        }));
    }
}