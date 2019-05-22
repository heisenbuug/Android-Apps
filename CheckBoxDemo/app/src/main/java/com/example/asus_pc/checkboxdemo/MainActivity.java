package com.example.asus_pc.checkboxdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import java.io.*;

public class MainActivity extends AppCompatActivity {

    CheckBox ch1, ch2, ch3;
    Button b;
//    EditText t12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPrice();
    }

    private void getPrice()
    {
        ch1 = (CheckBox)findViewById(R.id.ch1);
        ch2 = (CheckBox)findViewById(R.id.ch2);
        ch3 = (CheckBox)findViewById(R.id.ch3);
        b = (Button)findViewById(R.id.b);
//        t12 = (EditText)findViewById(R.id.t1);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                StringBuilder str = new StringBuilder();
                int total = 0;
                str.append("Selected Items");
                if(ch1.isChecked())
                {
                    str.append("\nTea Added: Rs.50");
                    total += 50;
                }

                if(ch2.isChecked())
                {
                    str.append("\nCoffee Added: Rs.70");
                    total += 70;
                }

                if(ch3.isChecked())
                {
                    str.append("\nCold Drink Added: Rs.30");
                    total += 30;
                }
                str.append("\nTotal Price: " + total);

                Toast.makeText(getApplicationContext(), str.toString(), Toast.LENGTH_LONG).show();
//                Intent a = new Intent(MainActivity.this, second.class);
//                String str1 = "Price" + total;
//                a.putExtra("K1", str1);
//                startActivity(a);
            }
        });
    }
}
