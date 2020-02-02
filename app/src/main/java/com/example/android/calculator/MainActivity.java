package com.example.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlusClick(View view) {
        EditText element1 = (EditText) findViewById(R.id.num1);
        EditText element2 = (EditText) findViewById(R.id.num2);
        TextView resultText = (TextView) findViewById(R.id.textView);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resultPlus = num1 + num2;
        resultText.setText(Integer.toString(resultPlus));
    }

    public void onMinusClick(View view) {
        EditText element1 = (EditText) findViewById(R.id.num1);
        EditText element2 = (EditText) findViewById(R.id.num2);
        TextView resultText = (TextView) findViewById(R.id.textView);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resultMinus = num1 - num2;
        resultText.setText(Integer.toString(resultMinus));
    }

    public void onMultiplyClick(View view) {
        EditText element1 = (EditText) findViewById(R.id.num1);
        EditText element2 = (EditText) findViewById(R.id.num2);
        TextView resultText = (TextView) findViewById(R.id.textView);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resultMultiply = num1 * num2;
        resultText.setText(Integer.toString(resultMultiply));
    }

    public void onDivideClick(View view) {
        EditText element1 = (EditText) findViewById(R.id.num1);
        EditText element2 = (EditText) findViewById(R.id.num2);
        TextView resultText = (TextView) findViewById(R.id.textView);

        int num1 = Integer.parseInt(element1.getText().toString());
        int num2 = Integer.parseInt(element2.getText().toString());
        int resultDivide = num1 / num2;
        resultText.setText(Integer.toString(resultDivide));
    }

}