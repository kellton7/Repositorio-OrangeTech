package edu.kelton.loops;
import java.util.Random;

public class ex9_numAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int numAleatorio [] = new int [20];
        
        for(int i = 0;  i < numAleatorio.length; i ++){
            int numero = random.nextInt(100);
            numAleatorio[i]= numero;
        }
        System.out.println("Numeros aleatórios: ");
        for (int numero : numAleatorio) {
            System.out.print(numero+ "\t ");
        }
        System.out.println("Sucessores dos numeros aleatórios: ");
        for (int numero : numAleatorio) {
            System.out.print((numero+ 1) + "\t ");
        }
        System.out.println("Antecessor dos numeros aleatórios: ");
        for (int numero : numAleatorio) {
            System.out.print((numero- 1) + "\t ");
        }
    }
}
