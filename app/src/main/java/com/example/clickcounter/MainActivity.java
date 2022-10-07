package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private Button buttonPlus, buttonMinus;
    private TextView textviewCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void init() {
        relativeLayout = findViewById(R.id.relativeLayout);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        textviewCounter = findViewById(R.id.textviewCounter);
    }

    public void PlusClick(View view) {

    }

    public void MinusClick(View view) {

    }

    public void CounterClick(View view) {

    }
}