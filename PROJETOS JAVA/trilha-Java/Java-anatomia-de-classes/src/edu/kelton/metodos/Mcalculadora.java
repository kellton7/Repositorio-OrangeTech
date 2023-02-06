package edu.kelton.metodos;

public class Mcalculadora {
    
    public static void soma (double num1, double num2){
        double resulatdo = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " = " + resulatdo);
    }

    public static void subtração(double num1, double num2){
        double resulatdo = num1 - num2;
        System.out.println("A subtração de " + num1 + " - " + num2 + " = " + resulatdo);
    }

    public static void divisão(double num1, double num2){
        double resulatdo = num1 / num2;
        System.out.println("A divisão de " + num1 + " / " + num2 + " = " + resulatdo);
    }

    public static void multiplicação(double num1, double num2){
        double resulatdo = num1 * num2;
        System.out.println("A multipicação de " + num1 + " * " + num2 + " = " + resulatdo);
    }
}
