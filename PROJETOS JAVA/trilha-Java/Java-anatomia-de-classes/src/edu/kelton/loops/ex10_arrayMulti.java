package edu.kelton.loops;

import java.util.Random;

public class ex10_arrayMulti {
    public static void main(String[] args) {
        Random random =new Random();

        int [][] M = new int [4][4];
        
        for(int l = 0; l < M.length ; l++){

            for(int c =0; c < M[l].length; c++){
                M[l][c] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
        }
        System.out.println(" ");
    }
}
}
