package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Facade.SubsSistema;

public class Service {

    private Service(){
    }
    
    public static void salvarCliente(String nome, String gmail, String cep, Integer celular, String cidade, String senha){
        System.out.println("Cliente salvo no Sistema!");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(senha);
        System.out.println(gmail);
        System.out.println(cidade);
    }
}
