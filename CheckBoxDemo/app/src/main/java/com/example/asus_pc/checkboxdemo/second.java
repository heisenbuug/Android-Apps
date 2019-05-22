package com.example.asus_pc.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle app = getIntent().getExtras();
        String str = app.getString("K1");
        tv = (TextView)findViewById(R.id.tv);
        tv.setText(str);
    }
}
