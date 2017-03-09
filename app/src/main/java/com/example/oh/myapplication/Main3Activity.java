package com.example.oh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText e3, e4;
    Button b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init();
    }

    void init(){
        e3 = (EditText)findViewById(R.id.editText3);
        e4 = (EditText)findViewById(R.id.editText4);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String birthyear = e3.getText().toString();
                int result = 2017 - Integer.parseInt(birthyear) + 1;

                Toast.makeText(getApplicationContext(), "당신의 나이는 " + result + "세 입니다.", Toast.LENGTH_SHORT).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = e4.getText().toString();
                int result = 2017 - Integer.parseInt(age) + 1;

                Toast.makeText(getApplicationContext(), "당신의 태어난 해는 " + result + "년 입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
