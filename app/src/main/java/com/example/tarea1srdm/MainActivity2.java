package com.example.tarea1srdm;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    private TextView resultadoTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultadoTextView = findViewById(R.id.resultadoTextView);
        Button btnregresar = findViewById(R.id.btnregresar);

        // Obtener el resultado de la primera pantalla
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("resultado")) {
            double resultado = intent.getDoubleExtra("resultado", 0.0);
            resultadoTextView.setText("Resultado: " + resultado);
        }

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}