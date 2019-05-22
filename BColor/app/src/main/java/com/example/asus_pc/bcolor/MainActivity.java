package com.example.asus_pc.bcolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = this.getWindow().getDecorView();
        v.setBackgroundResource(R.color.colorPrimary);
        goRed();
        goGreen();
        goBlue();
        goPrimary();
    }
    public void goRed(){

        b1 = (Button)findViewById(R.id.br);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                v = (View)findViewById(R.id.v1);
                v.setBackgroundResource(R.color.red);
            }
        });
    }
    public void goGreen(){
        b2=(Button)findViewById(R.id.bg);
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                v = (View)findViewById(R.id.v1);
                v.setBackgroundResource(R.color.green);
            }
        });
    }
    public void goBlue(){
        b3=(Button)findViewById(R.id.bb);
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                v = (View)findViewById(R.id.v1);
                v.setBackgroundResource(R.color.blue);
            }
        });
    }
    public void goPrimary(){
        b4=(Button)findViewById(R.id.brs);
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                v = (View)findViewById(R.id.v1);
                v.setBackgroundResource(R.color.colorPrimary);
            }
        });
    }
}