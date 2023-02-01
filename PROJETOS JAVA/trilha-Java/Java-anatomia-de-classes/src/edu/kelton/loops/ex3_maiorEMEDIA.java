package edu.kelton.loops;
import java.util.Scanner;

public class ex3_maiorEMEDIA{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int count = 0;
        int maior= 0;
        int soma = 0;

        do {
            System.out.println("Digite o número: ");
            num = scan.nextInt();
            soma = soma + num;
            if (num > maior) maior = num;

            count = ++count;
        } while(count < 5);

        System.out.println("O maior valor é: "+ maior);
        System.out.println("A média entre os numeros é: " + (soma / 5));
    }
}