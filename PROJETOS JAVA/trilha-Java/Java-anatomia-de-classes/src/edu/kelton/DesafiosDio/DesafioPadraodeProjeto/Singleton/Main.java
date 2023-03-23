package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyholder holder = SingletonLazyholder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyholder.getInstancia();
        System.out.println(holder);
    }
}
