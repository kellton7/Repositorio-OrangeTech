package edu.kelton.loops;
import java.util.Scanner;
public class parEINPAR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantnum;
        int num;
        int quantPar= 0, quantImp = 0;

        System.out.println("Quantos números você vai informar? ");
        quantnum = scan.nextInt();
        
        int count = 0;
        do {

            System.out.println("Informe o número: ");
            num = scan.nextInt();
            count++;

            if (num % 2 == 0) quantPar ++;
            else quantImp++;

        } while(count < quantnum);

        System.out.println("Pares: "+ quantPar );
        System.out.println("Impar: "+ quantImp);
    }
}
