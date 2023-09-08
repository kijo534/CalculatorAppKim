package com.example.calculatorappkim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double previousNum;
    TextView num1TV, num2TV, answerTV;
    String previewNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1TV = findViewById(R.id.num1);
        num2TV = findViewById(R.id.num2);
        answerTV = findViewById(R.id.answer);
        previewNum = "";


    }

    public void add(View view){
        // use an if statment to see if text is empty .equals("") OR
        // try catch block
        
            previewNum = "";



    }
    public void multiply(View view){
        double num1 = Double.parseDouble(num1TV.getText().toString());
        double num2 = Double.parseDouble(num2TV.getText().toString());
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

    public void numSelected(View v){
        if(v.getId() == R.id.oneButton){
            Log.i("Kim", "1 click");
            previewNum += 1;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.twoButton){
            previewNum += 2;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.threeButton){
            previewNum += 3;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.fourButton){
            previewNum += 4;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.fiveButton){
            previewNum += 5;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.sixButton){
            previewNum += 6;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.sevenButton){
            previewNum += 7;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.eightButton){
            previewNum += 8;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.nineButton){
            previewNum += 9;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.zeroButton){
            previewNum += 0;
            answerTV.setText(previewNum);
        }
        if(v.getId() == R.id.decimalButton){
            previewNum += ".";
            answerTV.setText(previewNum);
        }

        if(v.getId() == R.id.deleteButton){
            int len = previewNum.length();
            if(len != 0) {
                previewNum = previewNum.substring(0, len - 1);
                answerTV.setText(previewNum);
            }
        }
    }
}