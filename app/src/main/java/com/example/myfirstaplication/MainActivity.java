package com.example.myfirstaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_sumar;
    Button btn_restar;
    Button btn_multiplicar;
    Button btn_dividir;
    Button btn_limpiar;
    EditText cantidad1;
    EditText cantidad2;
    TextView total;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad1 = findViewById(R.id.primerNumero);
        cantidad2 = findViewById(R.id.segundoNumero);
        total = findViewById(R.id.resultadoTotal);
        btn_limpiar = findViewById(R.id.delete);
        btn_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total.setText("0");
                cantidad1.setText("");
                cantidad2.setText("");
            }
        });
        btn_sumar = findViewById(R.id.sumar);
        btn_restar = findViewById(R.id.restar);
        btn_multiplicar = findViewById(R.id.multiplicar);
        btn_dividir = findViewById(R.id.dividir);

    }
    public void onClick_sumar(View v) {
        int num1 = Integer.parseInt(cantidad1.getText().toString());
        int num2 = Integer.parseInt(cantidad2.getText().toString());
        int resultado = num1 + num2;
        total.setText(String.valueOf(resultado));
    }
    public void onClick_restar(View v) {
        int num1 = Integer.parseInt(cantidad1.getText().toString());
        int num2 = Integer.parseInt(cantidad2.getText().toString());
        int resultado = num1 - num2;
        total.setText(String.valueOf(resultado));
    }
    public void onClick_multiplicar(View v) {
        int num1 = Integer.parseInt(cantidad1.getText().toString());
        int num2 = Integer.parseInt(cantidad2.getText().toString());
        int resultado = num1 * num2;
        total.setText(String.valueOf(resultado));
    }
    public void onClick_dividir(View v) {
        double num1 = Integer.parseInt(cantidad1.getText().toString());
        double num2 = Integer.parseInt(cantidad2.getText().toString());
        double resultado = num1 / num2;
        total.setText(String.valueOf(resultado));
    }

}