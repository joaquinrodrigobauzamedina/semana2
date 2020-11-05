package com.example.contactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText Cajanombre;
    private TextInputEditText Cajatelefono;
    private TextInputEditText Cajamail;
    private TextInputEditText Cajadescripcion;
    private DatePicker fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton1     =  (Button) findViewById(R.id.button);
        fecha            =  findViewById(R.id.fecha);
        Cajanombre       =  findViewById(R.id.textonombre);
        Cajatelefono     =  findViewById(R.id.textotelefono);
        Cajamail         =  findViewById(R.id.textocorreo);
        Cajadescripcion  =  findViewById(R.id.textodescripcion);
        boton1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Guardarcontactos.class);
                intent1.putExtra("Nombre",Cajanombre.getText().toString());
                intent1.putExtra("Telefono",Cajatelefono.getText().toString());
                intent1.putExtra("Mail",Cajamail.getText().toString());
                intent1.putExtra("Descripcion",Cajadescripcion.getText().toString());
                intent1.putExtra("Fecha",String.valueOf(fecha.getDayOfMonth() + "/" + fecha.getMonth() + "/" + fecha.getYear()));
                startActivity(intent1);
            }
        });
    }
}
