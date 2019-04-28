package com.manu.ejemplompv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoView extends AppCompatActivity implements AlCuadrado.View {

    private TextView tvAlCuadrado;
    private EditText edtAlCualdrado;
    private Button boton;

    //Objeto de tipo Interface para comunicar la vista con el presenter
    private AlCuadrado.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAlCuadrado = findViewById(R.id.tvResultado);
        boton = findViewById(R.id.btnCalcular);
        edtAlCualdrado = findViewById(R.id.edtAlCuadrado);

        // Inicializamos el objeto presentador y le pasamos la vista
        presenter = new AlCuadradoPresenter(this);


    }

    public void calcular(View view){
        presenter.alCuadrado(edtAlCualdrado.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvAlCuadrado.setText(result);
    }

    @Override
    public void showError(String error) {
        tvAlCuadrado.setText(error);
    }


}
