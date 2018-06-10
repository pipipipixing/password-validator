package com.example.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text= findViewById(R.id.textView);
        final EditText password = findViewById(R.id.password);
        final Button check = findViewById(R.id.checkbottom);

        final Validator vali = new Validator();
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PassW= password.getText().toString();
                if(vali.check_password(PassW)==true){
                    text.setText("strong");
                }
                else
                    text.setText("not strong");
            }
        });
    }
}
