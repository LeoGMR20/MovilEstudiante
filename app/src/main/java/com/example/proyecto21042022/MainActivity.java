package com.example.proyecto21042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    //Atributos -> Componentes visuales
    private EditText etNombre, etApellido,etCelular;
    private Button btnRegistrar;
    private Switch swEstudiante;

    //Atributos generales

    private Estudiante estudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
    }

    private void inicializarVistas(){
        etNombre = findViewById(R.id.etNombre);
        etApellido = findViewById(R.id.etApellido);
        etCelular = findViewById(R.id.etCelular);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        swEstudiante = findViewById(R.id.swEstudiante);
    }

    private void obtenerInformacion(){
        String nombre = etNombre.getText().toString();
        String apellido = etApellido.getText().toString();
        int celular = Integer.parseInt(etCelular.getText().toString());
        //En el switch o checkbox ustedes quieren obtener el valor
        //cuando el elemento ha sdo marcado y eso es un atributo
        //llamdo checked
        //en valores booleanos el get cambia por is por temas de lenguaje
        boolean esEstudiante = swEstudiante.isChecked();
        estudiante = new Estudiante(nombre,apellido,celular,esEstudiante);
    }
}