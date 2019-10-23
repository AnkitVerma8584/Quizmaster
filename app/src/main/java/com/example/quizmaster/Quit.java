package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quit extends AppCompatActivity {
    Button yes,no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quit);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(Quit.this,MainActivity.class);
                startActivity(it);
            }
        });

    }
}
