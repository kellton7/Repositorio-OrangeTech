package edu.kelton.loops;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class ex5_tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numtabuada;
        
        System.out.println("Qual tabuada voçê quer: ");
        numtabuada = scan.nextInt();

        if (numtabuada > 10){
            System.out.println("Ops! Você tem que informar um valor menor que 11");
        }else {
            System.out.println("Tabuada de " + numtabuada);

            
            for( int i = 1; i <= 10; i++ ){
                System.out.println(numtabuada + " x " + i + " = " + (numtabuada * i) );
            }
        }
    }
}
