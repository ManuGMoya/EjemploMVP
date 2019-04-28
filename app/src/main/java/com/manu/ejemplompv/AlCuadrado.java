package com.manu.ejemplompv;

public interface AlCuadrado {

    interface View{
        void showResult(String result);
        void showError(String error);
    }

    interface Presenter{
        void showError(String error);
        void showResult(String result);
        void alCuadrado(String data);
    }

    interface Model{
        void alCuadrado(String data);
    }


}
