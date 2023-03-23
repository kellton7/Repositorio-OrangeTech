package edu.kelton.DesafiosDio.DesafioPadraodeProjeto.Strategy;

public class Main {
    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefesivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(agressivo);

        robo.andar();
        robo.andar();
       
        robo.setComportamento(defensivo);
        robo.andar();

        robo.setComportamento(normal);
        robo.andar();
        robo.andar();
        
    }
}
