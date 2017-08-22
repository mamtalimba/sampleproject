package com.example.cub11.nitjaipurportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_login, btn_signup;
    EditText et_username, et_password;
    String username, password;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_new_activity);

        btn_login=(Button)findViewById(R.id.button);
        btn_signup=(Button)findViewById(R.id.button2);

        et_username=(EditText)findViewById(R.id.editText_username);
        et_password=(EditText)findViewById(R.id.editText_password);
        tv=(TextView)findViewById(R.id.textView);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=et_username.getText().toString();
                password=et_password.getText().toString();
                Toast.makeText(MainActivity.this, "raman", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "mamta", Toast.LENGTH_SHORT).show();

                tv.setText(username+password);
            }
        });


    }



}
