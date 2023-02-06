package edu.kelton.metodos;

public class Memprestimo {
    
    public static int getDuasParcelas() {
        return 2;
    }

    public static int gerTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.50;
    }

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final de empréstimo para 2 parcelas: R$" + valorFinal);

        }else if (parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Valor final de empréstimo para 3 parcelas: R$" + valorFinal);

        }else {
            System.out.println("Quantidade de parcelas insuficinete!");
        }
    }
}
