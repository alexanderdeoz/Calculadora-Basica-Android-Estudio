package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_suma;
    private Button btn_division;
    private Button btn_multiplicasion;
    private Button btn_resta;

    private TextView text_respuesta;
    private EditText edit_num1;
    private  EditText edit_num2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.respuesta);

        edit_num1 = findViewById(R.id.num1);
        edit_num2= findViewById(R.id.num2);



        btn_suma= findViewById(R.id.btnSuma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(suma(Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString()))+"");
            }
        });


        btn_resta=findViewById(R.id.btnResta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(resta(Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString()))+"");
            }
        });


        btn_division=findViewById(R.id.btnDivision);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(division (Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString()))+"");
            }
        });



        btn_multiplicasion=findViewById(R.id.btnMultiplicasion);
        btn_multiplicasion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(multiplicasion (Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString()))+"");
            }
        });






    }

    public  double suma (double a,double b){
        return  a+b;
    }
    public  double resta (int a,double b){
        return  a-b;
    }
    public  double multiplicasion (double a,double b){
        return  a*b;
    }
    public double division (double a , double b){

        if (b ==0){
            return 0;
        }

        return  a/b;
    }


}