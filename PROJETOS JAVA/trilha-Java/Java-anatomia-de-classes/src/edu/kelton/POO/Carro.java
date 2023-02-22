package edu.kelton.POO;

class Carro{

    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){
    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // métodos set e get

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

     void setModelo(String modelo){
        this.modelo = modelo;
     }

     String getModelo(){
        return modelo;
     }

     // set e ger da capacidade do  tanque

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //método para encher o tanque

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
