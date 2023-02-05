package edu.kelton.loops;
public class ex7_0rdemInversa{
    public static void main(String[] args) {

        int [] vetor = {1, 54, 4, 3, -5, 8};
        int count= 0;

        System.out.println("\nVetor: ");
        while (count < (vetor.length)){
            System.out.println(vetor[count] + " ");
            count++;
        }
        System.out.println("\nVetor Invertido: ");

        for(int i = (vetor.length - 1); i > 0; i --){
            System.out.println(vetor[i] + " ");
        }

        
    }
}
