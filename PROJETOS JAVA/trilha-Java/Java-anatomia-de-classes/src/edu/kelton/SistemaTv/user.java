package edu.kelton.SistemaTv;

public class user {
    public static void main(String[] args) {

        smartTv smartTv = new smartTv ();
        
        System.out.println("A TV está ligada: " + smartTv.ligado);
        System.out.println("O volume está em: " + smartTv.volume);
        
        smartTv.ligar ();
        System.out.println("Ligar TV - A TV está ligada: " + smartTv.ligado);
        smartTv.desligar();
        System.out.println("Desligar TV - A TV está ligada: " + smartTv.ligado);

        smartTv.aumentarVolume();
        System.out.println("Novo volume - O volume da tv está em: "+smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo volume - O volume da tv está em: "+smartTv.volume);

        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("O novo canal é: " + smartTv.canal);
}
}