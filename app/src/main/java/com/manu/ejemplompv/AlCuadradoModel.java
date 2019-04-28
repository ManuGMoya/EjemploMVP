package com.manu.ejemplompv;

import android.widget.Toast;

public class AlCuadradoModel implements AlCuadrado.Model{

    //Objeto de tipo interface para conectar el Modelo con el Presentador
    private AlCuadrado.Presenter presenter;
    public double resultado;

    // En el constructor, le pasamos el objeto presentador al modelo
    public AlCuadradoModel(AlCuadrado.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void alCuadrado(String data) {
        try {
            resultado = Double.valueOf(data)*Double.valueOf(data);
            // Aqui la comunicacion vuelve de vuelta al presentador
            presenter.showResult(String.valueOf(resultado));
        }catch (NumberFormatException e){
            // Llamamos al metodo del presentador
            presenter.showError("Introduzca un numero!");
        }

    }
}
