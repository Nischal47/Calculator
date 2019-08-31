package com.example.calculator3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public boolean isOperator = false;
    public boolean noRespond = false;
    public  boolean decimal=false;

    public String temp;
    public char operator;

    EditText content;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnMul, btnDiv, btnEqual, btnC, btnDec, btnDel;
    char a;
    String contentData;

    Calculate cal = new Calculate();

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


        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnC = (Button) findViewById(R.id.btnClear);
        btnDec = (Button) findViewById(R.id.btnDec);
        btnDel = (Button) findViewById(R.id.btnDel);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnDec.setOnClickListener(this);
        btnDel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_0:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (!temp.isEmpty()) {


                        if (Double.parseDouble(temp) != 0 || temp.charAt(temp.length() - 1)=='.') {
                            if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                                content.setText("0");
                            } else {
                                content.setText(temp + "0");
                            }
                        }else{
                            content.setText("0");
                        }
                    }else{
                        content.setText("0");
                    }


                }


                break;
            case R.id.btn_1:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("1");
                    } else {
                        content.setText(temp + "1");
                    }
                }


                break;

            case R.id.btn_2:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("2");
                    } else {
                        content.setText(temp + "2");
                    }
                }

                break;
            case R.id.btn_3:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("3");
                    } else {
                        content.setText(temp + "3");
                    }
                }

                break;
            case R.id.btn_4:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("4");
                    } else {
                        content.setText(temp + "4");
                    }
                }

                break;
            case R.id.btn_5:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("5");
                    } else {
                        content.setText(temp + "5");
                    }
                }

                break;
            case R.id.btn_6:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("6");
                    } else {
                        content.setText(temp + "6");
                    }
                }

                break;
            case R.id.btn_7:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("7");
                    } else {
                        content.setText(temp + "7");
                    }
                }

                break;
            case R.id.btn_8:

                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("8");
                    } else {
                        content.setText(temp + "8");
                    }
                }

                break;
            case R.id.btn_9:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                        content.setText("9");
                    } else {
                        content.setText(temp + "9");
                    }
                }

                break;
            case R.id.btnAdd:
                temp = content.getText().toString();

                if (!temp.isEmpty()) {
                    cal.readData(temp, isOperator);
                    isOperator = true;
                    operator = '+';
                    content.setText("+");
                    noRespond = false;
                }
                break;
            case R.id.btnSub:
                temp = content.getText().toString();
                if (!temp.isEmpty()) {
                    cal.readData(temp, isOperator);
                    isOperator = true;
                    operator = '-';
                    content.setText("-");
                    noRespond = false;
                }
                break;
            case R.id.btnMul:
                temp = content.getText().toString();
                if (!temp.isEmpty()) {
                    cal.readData(temp, isOperator);
                    isOperator = true;
                    operator = '*';
                    content.setText("*");
                    noRespond = false;
                }
                break;
            case R.id.btnDiv:
                temp = content.getText().toString();
                if (!temp.isEmpty()) {
                    cal.readData(temp, isOperator);
                    isOperator = true;
                    operator = '/';
                    content.setText("/");
                    noRespond = false;
                }

                break;
            case R.id.btnEqual:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (!temp.isEmpty()) {
                        cal.readData(temp, isOperator);
                        cal.setResult(operator);
                        temp = cal.showData();
                        content.setText(temp);
                        noRespond = true;
                    }

                }

                break;
            case R.id.btnDec:

                temp = content.getText().toString();
                if (!temp.isEmpty()) {

                    if (!temp.equals("+") || !temp.equals("-") || !temp.equals("*") || !temp.equals("/")) {
                        content.setText(temp + ".");
                    }
                }
                break;
            case R.id.btnDel:
                if (noRespond == false) {
                    temp = content.getText().toString();
                    if (!temp.isEmpty()) {
                        content.setText(cal.removeLastChar(temp));
                    }
                }
                break;
            case R.id.btnClear:
                cal.clear();
                content.setText("");
                isOperator = false;
                noRespond = false;
                break;
        }
    }
}
