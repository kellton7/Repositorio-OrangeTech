package edu.kelton.DesafiosDio;
import java.util.Scanner;     
public class Program {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int entrada = leitor.nextInt();
        int mesada = 50;
        int total = entrada * mesada;
        System.out.println(total);

        /*
        int entrada; 
        int mesada = 50;
        int total = entrada * mesada;

        System.out.println("Quantidade de mês: ");
        entrada = leitor.nextInt();

        System.out.println("Você vai acumular R$ " + total + " juntando " + entrada + " meses");
         */
    }
}
