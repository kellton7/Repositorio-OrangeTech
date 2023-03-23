package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Singleton;

// Lazy Holder
public class SingletonLazyholder{

    private static class Holder{
    public static SingletonLazyholder instencia = new SingletonLazyholder();
}
    private SingletonLazyholder() {
    }

    public static SingletonLazyholder getInstancia(){
        return Holder.instencia;
    }
}
