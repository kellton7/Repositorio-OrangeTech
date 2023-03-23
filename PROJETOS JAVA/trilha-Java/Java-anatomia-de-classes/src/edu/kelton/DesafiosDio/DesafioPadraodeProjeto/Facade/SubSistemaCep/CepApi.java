package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Facade.SubSistemaCep;
public class CepApi {
    
        private static CepApi instencia = new CepApi();
    
        private CepApi() {
        }
    
        public static CepApi getInstancia(){
            return instencia;
        }

        public String recuperarSenha(String cep){
            return "0000";
        }

        public String recuperarCidade(String gmail){
            return "4353@fegdfbdfb";
        }
}
