package com.example.syl.sportquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Button button;
    private EditText givaname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button1);
        givaname=(EditText)findViewById(R.id.yourname);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (givaname.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "You didn't give me a name!", Toast.LENGTH_LONG).show();
                    return;
                }
                    String namevalue = givaname.getText().toString();
                    Intent buttonIntent = new Intent(MainActivity.this, Questions.class);
                    buttonIntent.putExtra("Name", namevalue);
                    startActivity(buttonIntent);


                }

            });
        }
    }
