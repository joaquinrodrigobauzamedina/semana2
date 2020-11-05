package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Guardarcontactos extends AppCompatActivity implements View.OnClickListener {
    private TextView cnombre;
    private TextView ctelefono;
    private TextView ccorreo;
    private TextView cdescripcion;
    private TextView fecha2;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardarcontactos);
        Bundle paramentros  = getIntent().getExtras();
        String nombre       = paramentros.getString("Nombre");
        String telefono     = paramentros.getString("Telefono");
        String mail         = paramentros.getString("Mail");
        String descripcion  = paramentros.getString("Descripcion");
        String fecha        = paramentros.getString("Fecha");

        cnombre         = findViewById(R.id.cnombre);
        ctelefono       = findViewById(R.id.ctelefono);
        ccorreo         = findViewById(R.id.ccorreo);
        cdescripcion    = findViewById(R.id.cdescripcion);
        fecha2          = findViewById(R.id.cfecha);
        button2     =  (Button) findViewById(R.id.button2);

        cnombre.setText("nombre: " + nombre);
        ctelefono.setText("telefono: " + telefono);
        ccorreo.setText("Correo: " + mail);
        cdescripcion.setText("Descripcion:" + descripcion);
        fecha2.setText("fecha de nacimiento :" + fecha);

        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        finish();
    }
}