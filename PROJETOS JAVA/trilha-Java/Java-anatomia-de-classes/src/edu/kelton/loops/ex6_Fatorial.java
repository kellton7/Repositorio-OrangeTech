package edu.kelton.loops;
import java.util.Scanner;

public class ex6_Fatorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Digite o número: ");
        num = scan.nextInt();

        int mult = 1;

        for(int i = num; i >= 1 ; i-- ){
            mult = mult * i;
        }
        System.out.println(num + "!" + " = " + mult);
}
}