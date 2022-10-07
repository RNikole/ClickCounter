package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private Button buttonPlus, buttonMinus;
    private TextView textviewCounter;

    int szamlalo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @SuppressLint("ResourceAsColor")
    public void PlusClick(View view) {
        szamlalo += 1;
        Counter();
    }

    public void MinusClick(View view) {
        szamlalo -= 1;
        Counter();
    }

    public void CounterClick(View view) {
        szamlalo = 0;
        Counter();
    }

    public void Counter() {
        textviewCounter.setText(String.valueOf(szamlalo));
        if (szamlalo < 0){
            textviewCounter.setTextColor(Color.RED);
        } else if (szamlalo > 0){
            textviewCounter.setTextColor(Color.GREEN);
        } else if (szamlalo == 0){
            textviewCounter.setTextColor(Color.BLUE);
        }
    }
    public void init() {
        relativeLayout = findViewById(R.id.relativeLayout);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        textviewCounter = findViewById(R.id.textviewCounter);
    }
}