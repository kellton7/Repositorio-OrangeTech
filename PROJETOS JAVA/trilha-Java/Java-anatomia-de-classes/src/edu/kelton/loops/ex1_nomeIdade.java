package edu.kelton.loops;

 import java.util.Scanner;
public class ex1_nomeIdade{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0"))
            break; // se condição for executada para o programa 
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Fim!!!");
    }
}
