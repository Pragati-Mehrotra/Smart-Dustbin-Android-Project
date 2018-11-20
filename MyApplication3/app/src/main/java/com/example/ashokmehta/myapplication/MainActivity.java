package com.example.ashokmehta.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button7 = (Button) findViewById(R.id.button7);
        Button button10= (Button) findViewById(R.id.button10);

       button7.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
               Intent button7Intent = new Intent(MainActivity.this,Main2Activity.class);

               startActivity(button7Intent);
            }
       });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button7Intent = new Intent(MainActivity.this,FillBinDetails.class);

                startActivity(button7Intent);
            }
        });
    }


}
