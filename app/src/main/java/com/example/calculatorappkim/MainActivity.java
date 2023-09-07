package com.example.calculatorappkim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double previousNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void add(View view){
        TextView num1TV = findViewById(R.id.num1);
        double num1 = Double.parseDouble(num1TV.getText().toString());
        TextView num2TV = findViewById(R.id.num2);
        double num2 = Double.parseDouble(num2TV.getText().toString());
        TextView answerTV = findViewById(R.id.answer);
        String answer = String.valueOf((num1 + num2));
        answerTV.setText(answer);
    }
    public void multiply(View view){
        TextView num1TV = findViewById(R.id.num1);
        double num1 = Double.parseDouble(num1TV.getText().toString());
        TextView num2TV = findViewById(R.id.num2);
        double num2 = Double.parseDouble(num2TV.getText().toString());
        TextView answerTV = findViewById(R.id.answer);
        String answer = String.valueOf((num1 * num2));
        answerTV.setText(answer);
    }
    public void subtract(View view){
        TextView num1TV = findViewById(R.id.num1);
        double num1 = Double.parseDouble(num1TV.getText().toString());
        TextView num2TV = findViewById(R.id.num2);
        double num2 = Double.parseDouble(num2TV.getText().toString());
        TextView answerTV = findViewById(R.id.answer);
        String answer = String.valueOf((num1 - num2));
        answerTV.setText(answer);
    }
    public void divide(View view){
        TextView num1TV = findViewById(R.id.num1);
        double num1 = Double.parseDouble(num1TV.getText().toString());
        TextView num2TV = findViewById(R.id.num2);
        double num2 = Double.parseDouble(num2TV.getText().toString());
        TextView answerTV = findViewById(R.id.answer);
        String answer = String.valueOf((num1 / num2));
        answerTV.setText(answer);
    }
}