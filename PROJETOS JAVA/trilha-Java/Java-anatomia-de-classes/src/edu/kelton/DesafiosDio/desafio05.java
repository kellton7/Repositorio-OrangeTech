package edu.kelton.DesafiosDio;
import java.util.Scanner;

public class desafio05{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        if (velocidadeAtual <= 60){
            System.out.println("Nao foi multado");
        }else{
          System.out.println("Foi multado");
        }
        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.
    }
}
