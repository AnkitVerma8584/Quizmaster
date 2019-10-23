package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    String m="";
    TextView t,ms;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t=findViewById(R.id.money);
        ms=findViewById(R.id.msg);
        b=findViewById(R.id.button);
        m=getIntent().getExtras().getString("Money");
        t.setText(m);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1=new Intent (Result.this,Quizpage.class);
                startActivity(it1);
            }
        });
        if(m.equals("5 Crores"))
        {
            ms.setText("Congratulations!");
            b.setEnabled(false);
        }



    }
}
