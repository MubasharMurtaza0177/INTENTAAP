package com.example.intentassg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
Button bt1,bt2,button5,bt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
button5=findViewById(R.id.button5);
bt2=findViewById(R.id.bt2);
bt1=findViewById(R.id.bt1);
bt5=findViewById(R.id.bt5);
bt5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent l= new Intent(MainActivity2.this,MainActivity.class);
        startActivity(l);
    }
});
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z= new Intent( MainActivity2.this,Triangle.class);
                startActivity(z);
            }
        });
bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent y= new Intent( MainActivity2.this,Square.class);
        startActivity(y);
    }
});
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x= new Intent( MainActivity2.this, Rectangle.class);
                startActivity(x);

            }
        });
    }


    }
