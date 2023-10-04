package com.example.tarea1srdm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private Button btnsuma;
     private Button btnresta;
    private Button btnmulti;
     private Button btndivision;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmulti = findViewById(R.id.btnmulti);
        btndivision = findViewById(R.id.btndivision);


        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtener los valores ingresados por el usuario
                String numero1Str = numero1.getText().toString();
                String numero2Str = numero2.getText().toString();

                if (!numero1Str.isEmpty() && !numero2Str.isEmpty()) {
                    // Convertir los valores a números
                    double numero1 = Double.parseDouble(numero1Str);
                    double numero2 = Double.parseDouble(numero2Str);

                    // Realizar la suma
                    double resultado = numero1 + numero2;

                    // Enviar el resultado a la segunda pantalla
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                }

            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero1Str = numero1.getText().toString();
                String numero2Str = numero2.getText().toString();

                if (!numero1Str.isEmpty() && !numero2Str.isEmpty()) {
                    double numero1 = Double.parseDouble(numero1Str);
                    double numero2 = Double.parseDouble(numero2Str);

                    // Realizar la resta
                    double resultado = numero1 - numero2;

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                }
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1Str = numero1.getText().toString();
                String numero2Str = numero2.getText().toString();

                if (!numero1Str.isEmpty() && !numero2Str.isEmpty()) {
                    // Convertir los valores a números
                    double numero1 = Double.parseDouble(numero1Str);
                    double numero2 = Double.parseDouble(numero2Str);

                    // Realizar la multiplicacion
                    double resultado = numero1 * numero2;

                    // Enviar el resultado a la segunda pantalla
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                }
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numero1Str = numero1.getText().toString();
                String numero2Str = numero2.getText().toString();

                if (!numero1Str.isEmpty() && !numero2Str.isEmpty()) {

                    double numero1 = Double.parseDouble(numero1Str);
                    double numero2 = Double.parseDouble(numero2Str);

                    // Realizar la Division
                    double resultado = numero1 / numero2;

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                }
            }
        });



    }
}