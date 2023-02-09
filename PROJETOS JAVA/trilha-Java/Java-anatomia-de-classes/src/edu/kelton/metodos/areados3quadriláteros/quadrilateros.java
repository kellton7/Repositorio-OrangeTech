package edu.kelton.metodos.areados3quadriláteros;

import javax.sound.sampled.SourceDataLine;

public class quadrilateros {
    
    public static void area( double lado){

        System.out.println("Area do quadrado: " + lado  * lado);
    }

    public static void area (double lado1, double lado2) {
        
        System.out.println("Area do retãngulo: "+ lado1 * lado2);
    }

    public static void area (double baseMaior, double baseMenor, double altura) {
        
        System.out.println("Area do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }
}
