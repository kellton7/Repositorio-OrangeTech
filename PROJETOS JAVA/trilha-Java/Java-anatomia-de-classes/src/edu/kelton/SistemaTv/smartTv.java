package edu.kelton.SistemaTv;

import edu.kelton.TiposVariaveis.variaveis;

public class smartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }

    public void aumentarVolume(){
        // volume = volume + 1;
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        // volume = volume - 1;
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
