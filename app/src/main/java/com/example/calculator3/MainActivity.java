package com.example.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public boolean isOperator = false;
    public boolean isEqual = false;
    public boolean isdecimal=true;

    EditText content;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnplus, btnminus, btnmul, btndiv, btnequal, btnC, btndecimal;
    char a;
    String contentData;

    Calculate cal =new Calculate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content = (EditText) findViewById(R.id.tvShow);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btn0 = (Button) findViewById(R.id.btn_0);
        btnplus = (Button) findViewById(R.id.btnAdd);
        btnminus = (Button) findViewById(R.id.btnSub);
        btnmul = (Button) findViewById(R.id.btnMul);
        btndiv = (Button) findViewById(R.id.btnDiv);
        btnequal = (Button) findViewById(R.id.btnEqual);
        btnC = (Button) findViewById(R.id.btnClear);
        btndecimal = (Button) findViewById(R.id.btnDec);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.readData("1", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cal.readData("2", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.readData("3", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.readData("4", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.readData("5", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.readData("6", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.readData("7", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.readData("8", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.readData("9", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cal.readData("0", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperator == false) {
                    isOperator = true;
                    a = '+';
                    content.setText("+");
                } else {
                    a = '+';

                    cal.setResult(a);
                    content.setText("+");
                }

            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperator == false) {
                    isOperator = true;
                    a = '-';
                    content.setText("-");
                } else {
                    a = '-';
                    cal.setResult(a);

                    content.setText("-");
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperator == false) {
                    isOperator = true;
                    a = '*';
                    content.setText("*");
                } else {
                    a = '*';
                    cal.setResult(a);

                    content.setText("*");
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isOperator == false) {
                    isOperator = true;
                    a = '/';
                    content.setText("/");
                } else {
                    a = '/';
                    cal.setResult(a);

                    content.setText("/");
                }
            }
        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isEqual = true;
                isOperator = false;

                cal.setResult(a);

                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
                isEqual = false;
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isdecimal=true;
                isOperator=false;
                isEqual=false;
                cal.clear();
                contentData = cal.showData(isOperator, isEqual);
                content.setText(contentData);
            }
        });

        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isdecimal=true;
                cal.readData(".", isOperator,isdecimal);
                contentData = cal.showData(isOperator, isEqual)+".";
                isdecimal=false;
                content.setText(contentData);
            }
        });

    }
}
