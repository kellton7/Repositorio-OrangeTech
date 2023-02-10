package edu.kelton.metodos.areados3quadriláteros;

public class main{

    public static void main(String[] args) {
        
        //Area dos quadriláteros
        System.out.println("Area do Quadrilátero: ");

        double areaQuadrado = quadrilateros.area(5);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = quadrilateros.area(14d, 3d);
        System.out.println("Area do retãngulo: " + areaRetangulo);

        double areaTrapézio = quadrilateros.area(7, 5, 02);
        System.out.println("Area do trapézio: " + areaTrapézio);

        float areaLosangolo = quadrilateros.area(8f, 6f);
        System.out.println("Area do losangolo: " + areaLosangolo);  
    }
}