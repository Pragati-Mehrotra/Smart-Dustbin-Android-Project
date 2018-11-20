package com.example.ashokmehta.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FillBinDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_bin_details);
        final EditText input1,input2;
        Button button1;
        input1=(EditText)findViewById(R.id.editText4);
        input2=(EditText)findViewById(R.id.editText7);
        button1=(Button)findViewById(R.id.button8);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float p=Float.parseFloat(input1.getText().toString());
                int q=Integer.parseInt(input2.getText().toString());
                if(p<1)
                {
                    Intent intent=new Intent(FillBinDetails.this, CongratsActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Intent intent=new Intent(FillBinDetails.this, OopsActivity.class);
                    startActivity(intent);                }
            }



        });
        

    }
}
