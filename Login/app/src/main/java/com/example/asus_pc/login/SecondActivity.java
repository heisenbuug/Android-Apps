package com.example.asus_pc.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv2;
    String msg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle app = getIntent().getExtras();
        tv2 = (TextView)findViewById(R.id.tv2);
        msg1 = app.getString("FN");
        tv2.setText("Welcome " + msg1);

    }
}
