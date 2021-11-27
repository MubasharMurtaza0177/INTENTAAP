package com.example.intentassg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {
    private EditText txt1;
    private EditText txt2;
    private TextView ans;
    Button btt, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        txt1=findViewById(R.id.editTextNumber);
        txt2=findViewById(R.id.editTextNumber2);

        ans=findViewById(R.id.textView);
        btt=findViewById(R.id.btt);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q= new Intent(Triangle.this,MainActivity2.class);
                startActivity(q);
            }
        });
        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1= Integer.parseInt(txt1.getText().toString());
                int n2= Integer.parseInt(txt2.getText().toString());
                int area= (n1*n2)/2;
                ans.setText(String.valueOf(area));

            }
        });







    }
}