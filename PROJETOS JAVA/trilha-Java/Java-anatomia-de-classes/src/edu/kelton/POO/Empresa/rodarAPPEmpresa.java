package edu.kelton.POO.Empresa;

class rodarAPPEmpresa {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(); //criar objeto funcionario e guardar dentro de Funcionario.

        // Upcast   
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        // Downcast não deve ser utilzado 
        //Gerente gerente_ = new Gerente();
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
