package com.example.asus_pc.locationinput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ET1;
    Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET1 = (EditText)findViewById(R.id.ET1);
        B1 =(Button)findViewById(R.id.B1);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s;
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                s = ET1.getText().toString();
                intent.putExtra("FN", s);
                startActivity(intent);
            }
        });
    }
}
