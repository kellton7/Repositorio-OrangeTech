package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Singleton;

//Singleton Apressado!

public class SingletonEager {
    private static SingletonEager instencia = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstancia(){
        return instencia;
    }
}
