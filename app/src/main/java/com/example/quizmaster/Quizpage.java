package com.example.quizmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Quizpage extends AppCompatActivity {
    Button opa,opb,opc,opd,ll;
    TextView op1,op2,op3,op4,ques;
    int i=0;
    String str="";
    String q[]={"C language has been developed by?","C language has been developed at","C language came into existence in ","C is a ","C can be used on","C programs are converted into machine language by ","The real constant in C can be expressed in which of the foll terms.","A character Variable can at a time store","A C variable cannot start with","Hierarchy decides which operator"};
    String o1[]={"Ken Thompson","Microsoft corp,USA","1971","Middle level language","Only Ms Dos operating system","An interpreter","Fractional form only","1 character","An alphabet","is most important"};
    String o2[]={"Dennis Ritchie","AT & T Bell Labs, USA","1957","High level language","Only Unix operating system","A compiler","Exponential form only","8 characters","A number","is fastest"};
    String o3[]={"Peter Norton","Borderland International,USA","1972","Low level language","Only windows operating system","An operating system","ASCII form only","254 characters","A special symbol","is used first"};
    String o4[]={"Martin Richards","IBM,USA","1983","None of the above","All the above","None of the above","Both A & B","None of the above","Both B & C","operates on largest number"};
    String prize[]={"Baba Ji ka Thullu","1 lakh","2 lakh","5 lakh","10 lakh","20 lakhs","30 Lakhs","45 lakhs","50 Lakhs","80 Lakhs","1 Crore","5 Crores"};
    String e[]={"Correct","Correct again!","Nice","Nice work","Good start!","Great job","Excellent","Wow you got that correct!","Outstanding","Et Voila!"};
    int ans[]={2,2,3,1,4,2,4,1,4,3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizpage);
        opa=findViewById(R.id.opA);
        opb=findViewById(R.id.opB);
        opc=findViewById(R.id.opC);
        opd=findViewById(R.id.opD);
        ll=findViewById(R.id.lifeline);

        op1=findViewById(R.id.op1);
        op2=findViewById(R.id.op2);
        op3=findViewById(R.id.op3);
        op4=findViewById(R.id.op4);
        ques=findViewById(R.id.question);
        ques.setText(q[0]);
        op1.setText(o1[0]);
        op2.setText(o2[0]);
        op3.setText(o3[0]);
        op4.setText(o4[0]);
        opa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(1))
                {
                    Toast.makeText(getApplicationContext(),e[i], Toast.LENGTH_LONG).show();
                    i++;
                    change(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Oops!", Toast.LENGTH_LONG).show();
                    endquiz(i);
                }
            }
        });
        opb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(2))
                {
                    Toast.makeText(getApplicationContext(),e[i], Toast.LENGTH_LONG).show();
                    i++;
                    change(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Oops!", Toast.LENGTH_LONG).show();
                    endquiz(i);
                }
            }
        });
        opc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(3))
                {
                    Toast.makeText(getApplicationContext(),e[i], Toast.LENGTH_LONG).show();
                    i++;
                    change(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Oops!", Toast.LENGTH_LONG).show();
                    endquiz(i);
                }
            }
        });
        opd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check(4))
                {
                    Toast.makeText(getApplicationContext(),e[i], Toast.LENGTH_LONG).show();
                    i++;
                    change(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Oops!", Toast.LENGTH_LONG).show();
                    endquiz(i);
                }

            }
        });
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life(ans[i]);
            }
        });


    }
    boolean check(int a)
    {
        if(ans[i]==a)
            return true;
        else
        {
            return false;

        }
    }
    void change(int b)
    {
        if(b==10)
        {
            endquiz(11);
        }
        else {
            ques.setText(q[b]);
            op1.setText(o1[b]);
            op2.setText(o2[b]);
            op3.setText(o3[b]);
            op4.setText(o4[b]);
            opa.setEnabled(true);
            opb.setEnabled(true);
            opc.setEnabled(true);
            opd.setEnabled(true);
        }
    }
    void endquiz(int a)
    {
        Intent it1=new Intent (Quizpage.this,Result.class);
        str=prize[a];
        it1.putExtra("Money",str);
        startActivity(it1);
    }
    void life(int a)
    {
        if(a==1)
        {
            opc.setEnabled(false);
            opb.setEnabled(false);
            op3.setText("");
            op2.setText("");
        }
        if(a==2)
        {
            opc.setEnabled(false);
            opa.setEnabled(false);
            op3.setText("");
            op1.setText("");
        }
        if(a==3)
        {
            opa.setEnabled(false);
            opd.setEnabled(false);
            op1.setText("");
            op4.setText("");
        }
        if(a==4)
        {
            opc.setEnabled(false);
            opa.setEnabled(false);
            op3.setText("");
            op1.setText("");
        }
        ll.setEnabled(false);

    }
}
