package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Singleton;

// Singleton Prequiçoso!

public class SingletonLazy {
    
    private static SingletonLazy instencia;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstancia(){
        if (instencia == null){
            instencia = new SingletonLazy();
        }
        return instencia;
    }
}
