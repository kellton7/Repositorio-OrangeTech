package edu.kelton.atividadesjava;

import java.util.Locale;
import java.util.Scanner;

public class aboutme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá eu sou " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + "anos, minha altura é de:" + altura);
        
    }
}
