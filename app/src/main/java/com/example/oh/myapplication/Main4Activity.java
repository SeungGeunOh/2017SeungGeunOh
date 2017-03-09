package com.example.oh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        init();
    }

    void init(){
            e1 = (EditText)findViewById(R.id.editText1);
            e2 = (EditText)findViewById(R.id.editText2);
            b1 = (Button)findViewById(R.id.button1);
            b2 = (Button)findViewById(R.id.button2);
            final double degree = 1.8;

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String H_deg = e1.getText().toString();
                    double result = Integer.parseInt(H_deg) * degree + 32;

                    Toast.makeText(getApplicationContext(), "화씨 온도는 " + result + "도 입니다.", Toast.LENGTH_SHORT).show();
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String C_deg = e2.getText().toString();
                    double result = (Integer.parseInt(C_deg) - 32) / degree;

                    Toast.makeText(getApplicationContext(), "섭씨 온도는  " + result + "도 입니다.", Toast.LENGTH_SHORT).show();
                }
            });
    }
}
