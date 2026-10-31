package com.example.hellenaplicacin;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    TextView Mensaje;
    EditText etNombre;
    Button btnSaludar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Mensaje = findViewById(R.id.Mensaje);
        etNombre = findViewById(R.id.etNombre);
        btnSaludar = findViewById(R.id.btnSaludar);


        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombreIngresado = etNombre.getText().toString();

                Mensaje.setText("¡Hola, " + nombreIngresado + "! Qué gusto saludarte.");
            }
        });
    }
}