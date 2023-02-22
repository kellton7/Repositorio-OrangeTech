package edu.kelton.POO;

class main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("VERMELHO");
        carro1.setModelo("BMW M3");
        carro1.setCapacidadeTanque(80);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(7.45));

        Carro carro2 = new Carro("PRETO", "R35", 90);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(8.50));
    }
}
