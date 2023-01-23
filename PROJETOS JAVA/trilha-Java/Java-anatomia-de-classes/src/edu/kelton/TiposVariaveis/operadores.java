package edu.kelton.TiposVariaveis;

public class operadores{
    public static void main(String[] args) {
    /*Operadores
     == , != , < , > , <= , >= 
    Igual, Diferente, Menor, Maior, Menor igual, Maior igual 
    */

    //classe Operadores aritmeticos
    double soma = 10.5 + 15.7;
    //System.out.println(soma);
    int subtraçao = 113 - 25;   
    //System.out.println(subtraçao);
    int multiplicacao = 20 * 7;
    //System.out.println(multiplicacao);
    int divisao = 15 / 3;
    //System.out.println(divisao);
    int modulo = 18 % 3;
    //System.out.println(modulo);
    double resultado = (10 * 7) + (20/4);
    //System.out.println(resultado);
        
    // (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
    String nomeCompleto = "kelton" + "lima";
        
    String concatenacao ="?"; 
    
    concatenacao = 1+1+1+"1";
    //System.out.print(concatenacao);
    concatenacao = 1+"1"+1+1;
    //System.out.print(concatenacao);
    concatenacao = 1+"1"+1+"1";
    //System.out.print(concatenacao);
    concatenacao = "1"+1+1+1;
    //System.out.print(concatenacao);
    concatenacao = "1"+(1+1+1);
    //System.out.print(concatenacao);

    //operadores unarios 
    int numero = 5;
    boolean var = true;

    numero = - numero;  //numero + para -
    //System.out.println(numero);
    numero =  numero * -1; //numero - para +
    //System.out.println(numero);

    /*System.out.println(++ numero); incremento de +1
    System.out.println(-- numero); discremento de -1
    System.out.println(!var);  inverte o valor de true para false ou o contrario 
    */

    //Operador ternario (?:)
    int a,b;
    a = 1; b = 2;

    /*String valor = a == b ? "Verdadeiro" : "Falso";
    System.out.println(valor);*/
        
    //Operadores relacionais (== , != , < , > , <= , >=  )

    boolean comparacao = a == b; // (== , != , < , > , <= , >= )
    //System.out.println("Numero 'a' e igual a numero 'b' ? " + comparacao);

    comparacao = a > b;
   // System.out.println("Numero 'a' e maior que numero 'b' ? " + comparacao);

    comparacao = a != b;
    //System.out.println("Numero 'a' e diferente de numero 'b' ? " + comparacao);

    /*if(a >= b)
        System.out.println("Numero 'a'  e maior que numero 'b' ");
    else
        System.out.println("Numero 'a' e menor que numero 'b' ");*/
       
    // Operadores logicos (&& , || )
    boolean cond = true;
    boolean cond2 = false;

    if(cond && cond2){
        System.out.println("As duas condições são verdadeiras");
    }
    if(cond || cond2){
        System.out.println("Uma dascondições é verdadeiras");
    }
    System.out.println("FIM");
}
}
    

