package com.example.user.chapter4_178p;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOError;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button BtnAdd,BtnSub,BtnMul,BtnDiv,BtnRemain;
    TextView TextResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText)findViewById(R.id.Edit1);
        edit2 = (EditText)findViewById(R.id.Edit2);
        BtnAdd = (Button)findViewById(R.id.BtnAdd);
        BtnSub = (Button)findViewById(R.id.BtnSub);
        BtnMul = (Button)findViewById(R.id.BtnMul);
        BtnDiv = (Button)findViewById(R.id.BtnDiv);
        BtnRemain = (Button)findViewById(R.id.BtnRemain);
        TextResult = (TextView)findViewById(R.id.TextResult);

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }

            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);

                    if(Double.isInfinite(result))
                        Toast.makeText(getApplicationContext(), "0으로 나눴습니다.", Toast.LENGTH_SHORT).show();
                    else
                        TextResult.setText("계산 결과 : " + result.toString());
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        BtnRemain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    TextResult.setText("계산 결과 : " + result.toString());
                }catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(), "숫자를 입력해주세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
