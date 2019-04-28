package com.manu.ejemplompv;

public class AlCuadradoPresenter implements AlCuadrado.Presenter{

    // Objetos de tipo interface para conectar las capas
    private AlCuadrado.View view;
    private AlCuadrado.Model modelo;

    public AlCuadradoPresenter(AlCuadrado.View view){
        this.view = view;
        modelo = new AlCuadradoModel(this);
    }



    // Metodo que se comunica con la vista
    @Override
    public void showResult(String result) {
        // Comprobamos que tenemos la vista
        if(view!=null){
            // Llamamos al metodo de la vista desde el Presentador
            view.showResult(result);
        }
    }

    @Override
    public void showError(String error) {
        if(view!=null){
            // Llamamos al metodo de la vista desde el Presentador
            view.showError(error);
        }
    }

    // Metodo que se comunica con el modelo
    @Override
    public void alCuadrado(String data) {
        if(view!=null){
            modelo.alCuadrado(data);
        }
    }
}
