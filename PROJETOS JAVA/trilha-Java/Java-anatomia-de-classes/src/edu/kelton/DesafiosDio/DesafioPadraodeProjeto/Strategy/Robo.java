package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void andar(){
        comportamento.andar();
    }
}
