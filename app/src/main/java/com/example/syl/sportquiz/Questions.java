package com.example.syl.sportquiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Questions extends AppCompatActivity {
    int result;
    int resultQuestion, resultQuestion2, resultQuestion3, resultQuestion4,resultQuestion5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void submitbtn(View view) {

        RadioButton question1 = (RadioButton) findViewById(R.id.question1);
        boolean isquestion1 = question1.isChecked();
        RadioButton question2 = (RadioButton) findViewById(R.id.question2);
        boolean isquestion2 = question2.isChecked();
        RadioButton question3 = (RadioButton) findViewById(R.id.question3);
        boolean isquestion3 = question3.isChecked();
        RadioButton question4 = (RadioButton) findViewById(R.id.question4);
        boolean isquestion4 = question4.isChecked();
        if (isquestion3) {
            resultQuestion = 10;
        } else {
            resultQuestion = 0;
        }

        CheckBox question5 = (CheckBox) findViewById(R.id.question5);
        boolean isquestion5 = question5.isChecked();
        CheckBox question6 = (CheckBox) findViewById(R.id.question6);
        boolean isquestion6 = question6.isChecked();
        CheckBox question7 = (CheckBox) findViewById(R.id.question7);
        boolean isquestion7 = question7.isChecked();
        CheckBox question8 = (CheckBox) findViewById(R.id.question8);
        boolean isquestion8 = question8.isChecked();
        if (!isquestion5 && !isquestion6 && isquestion7 && isquestion8) {
            resultQuestion3 = 10;
        }

        RadioButton question9 = (RadioButton) findViewById(R.id.question9);
        boolean isquestion9 = question9.isChecked();
        RadioButton question10 = (RadioButton) findViewById(R.id.question10);
        boolean isquestion10 = question10.isChecked();
        RadioButton question11 = (RadioButton) findViewById(R.id.question11);
        boolean isquestion11 = question11.isChecked();
        RadioButton question12 = (RadioButton) findViewById(R.id.question12);
        boolean isquestion12 = question12.isChecked();
        if (isquestion12) {
            resultQuestion2 = 10;
        } else {
            resultQuestion2 = 0;
        }

        CheckBox question13 = (CheckBox) findViewById(R.id.question13);
        boolean isquestion13 = question13.isChecked();
        CheckBox question14 = (CheckBox) findViewById(R.id.question14);
        boolean isquestion14 = question14.isChecked();
        CheckBox question15 = (CheckBox) findViewById(R.id.question15);
        boolean isquestion15 = question15.isChecked();
        CheckBox question16 = (CheckBox) findViewById(R.id.question16);
        boolean isquestion16 = question16.isChecked();
        if (!isquestion13 && !isquestion14 && isquestion15 && !isquestion16) {
            resultQuestion4 = 10;
        }

        EditText question18=(EditText)findViewById(R.id.question18);
        String answerQuestion18=question18.getText().toString().toLowerCase();
        if(answerQuestion18.equals("barcelona")){
            resultQuestion5=10;
        }else {
            resultQuestion5=0;
        }

        result = resultQuestion + resultQuestion2 + resultQuestion3 + resultQuestion4+resultQuestion5;

        if (result >= 30) {
            Toast.makeText(this, "Your result is:" + result +  "Good Job!", Toast.LENGTH_LONG).show();
        } else if (result >= 10) {
            Toast.makeText(this, "Your result is:" + result +  "Not so good :(", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Your result is:" + result +  "Try again!", Toast.LENGTH_LONG).show();
        }
    }

    public void resetbtn(View view) {
        result = 0;
        RadioGroup radio = findViewById(R.id.radio);
        radio.clearCheck();
        RadioGroup radio2 = findViewById(R.id.radio2);
        radio2.clearCheck();
        CheckBox question5 = findViewById(R.id.question5);
        question5.setChecked(false);
        CheckBox question6 = findViewById(R.id.question6);
        question6.setChecked(false);
        CheckBox question7 = findViewById(R.id.question7);
        question7.setChecked(false);
        CheckBox question8 = findViewById(R.id.question8);
        question8.setChecked(false);
        CheckBox question13 = findViewById(R.id.question13);
        question13.setChecked(false);
        CheckBox question14 = findViewById(R.id.question14);
        question14.setChecked(false);
        CheckBox question15 = findViewById(R.id.question15);
        question15.setChecked(false);
        CheckBox question16 = findViewById(R.id.question16);
        question16.setChecked(false);
        EditText question18=findViewById(R.id.question18);
        question18.setText(null);
    }

}
