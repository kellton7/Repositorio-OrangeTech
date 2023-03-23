package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Facade;

import edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Facade.SubSistemaCep.CepApi;
import edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Facade.SubsSistema.Service;

public class Facade {
    
    public void trasferirClientes(String nome, String cep, String gmail){

        String senha = CepApi.getInstancia().recuperarSenha(cep);
        String cidade = CepApi.getInstancia().recuperarCidade(gmail);


        Service.salvarCliente(nome, gmail, cep, null, cidade, senha);
    }

}
