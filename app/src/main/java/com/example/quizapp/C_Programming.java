package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class C_Programming extends AppCompatActivity implements View.OnClickListener {

    RadioGroup rg;
    Button next;
    RadioButton r1,r2,r3,r4;
    TextView res,que;
    String question[]={"who is known as the founder of C language ? ", "What is the only function all C programs must contain ?",
            "Which of the following is the correct comment ? ","Which of the following is Correct about C ?",
            "Which of the following is not correct Variable tpe ?"};
    String op1[]={"ken", "start()", "*/Comments*/","Platform dependent","float"};
    String op2[]={"Andy Rubin", "System()", "**Comments**","Platform Independent","real"};
    String op3[]={"james", "main()", "/*Comments*/","High level Language","int"};
    String op4[]={"Denis Richi", "program()", "{Comments}","Machine Level Language","double"};
    String ans[]={"Denis Richi", "main()","/*comments*/","Platform dependent","real"};
    int i=0;
    int marks=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__programming);
        rg=findViewById(R.id.rg);
        res=findViewById(R.id.res);
        next=findViewById(R.id.next);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);
        que=findViewById(R.id.que);
        setQuestion();
        next.setOnClickListener(this);

    }
    private  void setQuestion()
    {
        que.setText(question[i]);
        r1.setText(op1[i]);
        r2.setText(op2[i]);
        r3.setText(op3[i]);
        r4.setText(op4[i]);
    }
    @Override
    public void onClick(View view) {
        if (i==4)
        {
            rg.setVisibility(View.INVISIBLE);
            que.setVisibility(View.INVISIBLE);
            RadioButton r=findViewById(rg.getCheckedRadioButtonId());
            if(r.getText().toString().equals(ans[i]))
            {
                marks+=10;
            }
            res.setText("Result is "+marks);
        }
        RadioButton r=findViewById(rg.getCheckedRadioButtonId());
        if(r.getText().toString().equals(ans[i]))
        {
            marks+=10;
        }
        if(i!=4){
            i++;
        }
        if(i==4)
        {
            next.setText("SUBMIT");
        }
        setQuestion();
        rg.clearCheck();

    }
}