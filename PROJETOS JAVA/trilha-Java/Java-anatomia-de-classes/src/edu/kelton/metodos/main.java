package edu.kelton.metodos;

public class main {
    public static void main(String[] args) {
        
        //Mcalculadora
        System.out.println("Calculadora: ");
        Mcalculadora.soma(5, 5);
        Mcalculadora.subtração(12, 7);
        Mcalculadora.multiplicação(10, 5);
        Mcalculadora.divisão(30, 5);
        System.out.println(" ");

        //Mmensagem
        System.out.println("Mensagem: ");
        Mmensagem.obterMensagem(9);
        Mmensagem.obterMensagem(12);
        Mmensagem.obterMensagem(14);
        System.out.println(" ");
        
        //Empréstimo
        System.out.println("Empréstimo: ");
        Memprestimo.calcular(1000, Memprestimo.getDuasParcelas());
        Memprestimo.calcular(1000, Memprestimo.gerTresParcelas());
        Memprestimo.calcular(1000, 6);
}
}