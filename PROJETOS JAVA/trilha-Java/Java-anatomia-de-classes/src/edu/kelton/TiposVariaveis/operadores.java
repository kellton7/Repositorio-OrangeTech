package edu.kelton.TiposVariaveis;
public class operadores{
    public static void main(String[] args) {
    //Operadores
    // == , != , < , > , <= , >= 
    // Igual, Diferente, Menor, Maior, Menor igual, Maior igual 

    //classe Operadores aritmeticos
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;   
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);
        
    // (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
    String nomeCompleto = "kelton" + "lima";
        
    String concatenacao ="?"; 

    concatenacao = 1+1+1+"1";

    System.out.print(concatenacao);
    
    concatenacao = 1+"1"+1+1;

    System.out.print(concatenacao);

    concatenacao = 1+"1"+1+"1";

    System.out.print(concatenacao);

    concatenacao = "1"+1+1+1;

    System.out.print(concatenacao);

    concatenacao = "1"+(1+1+1);

    System.out.print(concatenacao);
}
}
    

