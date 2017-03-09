package com.example.oh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    EditText e1, e2, e3;
    Button b1;
    CheckBox cb;
    TextView t1, t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        init();
    }

    void init(){
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        e3 = (EditText)findViewById(R.id.editText3);

        b1 = (Button)findViewById(R.id.button1);

        cb = (CheckBox)findViewById(R.id.checkBox1);

        t1 = (TextView)findViewById(R.id.textView1);
        t2 = (TextView)findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = e1.getText().toString();
                String spag = e2.getText().toString();
                String sala = e3.getText().toString();

                if (pizza.length() == 0) {
                    e1.setText("0");
                    pizza = e1.getText().toString();
                }
                if (spag.length() == 0) {
                    e2.setText("0");
                    spag = e2.getText().toString();
                }
                if (sala.length() == 0) {
                    e3.setText("0");
                    sala = e3.getText().toString();
                }

                int result1 = Integer.parseInt(pizza) + Integer.parseInt(spag) + Integer.parseInt(sala);
                int result2 = Integer.parseInt(pizza) * 15000 + Integer.parseInt(spag) * 13000 + Integer.parseInt(sala) * 9000;

                if  (cb.isChecked() == true)
                    result2 = result2*90/100;

                t1.setText(result1 + "개");
                t2.setText(result2 + "개");
            }
        });

    }
}
