package com.example.asus_pc.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText t1, t2;
    String usr, pwd;
    String msg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_check();
    }
    public void login_check(){
        t1 = (EditText)findViewById(R.id.t1);
        t2 = (EditText)findViewById(R.id.t2);
        b = (Button)findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usr = t1.getText().toString();
                pwd = t2.getText().toString();

                if(usr.equals("admin") && pwd.equals("root69")){
                    Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                    msg1 = t1.getText().toString();
                    intent.putExtra("FN",msg1);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "Please check ID or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

