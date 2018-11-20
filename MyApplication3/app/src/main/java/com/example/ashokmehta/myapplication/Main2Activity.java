package com.example.ashokmehta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main2);

        Button button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button4Intent = new Intent(Main2Activity.this,Main5Activity.class);

                startActivity(button4Intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button2Intent = new Intent(Main2Activity.this,Grieviance.class);

                startActivity(button2Intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button3Intent = new Intent(Main2Activity.this,howItWorks.class);

                startActivity(button3Intent);
            }
        });

        TextView clean = (TextView) findViewById(R.id.clean);

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cleanIntent = new Intent(Main2Activity.this,Main6Activity.class);

                startActivity(cleanIntent);
            }
        });

        TextView green = (TextView) findViewById(R.id.green);

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent greenIntent = new Intent(Main2Activity.this,Main4Activity.class);

                startActivity(greenIntent);
            }
        });



    }
}
