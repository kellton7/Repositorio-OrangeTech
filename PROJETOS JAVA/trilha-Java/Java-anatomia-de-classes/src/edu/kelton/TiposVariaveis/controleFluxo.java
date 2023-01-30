package edu.kelton.TiposVariaveis;

public class controleFluxo {
    public static void main(String[] args) {
        //Utilizando estrutura de repitição

         ifFlecha();
         ifSemFlecha();
         ifFerias();
         //ifMenor();

         switchFerias();
         switchSemana();
         switchNumero();
         
    }
    private static void ifFlecha(){
        int mes = 4;
        if (mes == 1){
            System.out.println("Janeiro");
        } else {
            if ( mes == 2){
                System.out.println("Fevereiro");
            } else {
                if (mes == 3){
                    System.out.println("Março");
                } else {
                    if (mes == 4){
                        System.out.println("Abril");
                    } else {
                        if (mes == 5){
                            System.out.println("Maio");
                        } else {
                            if (mes == 6){
                                System.out.println("Junho");
                            } else {
                                //...
                            }
                        }
                    }
                }
            }
        }
    }
    private static void ifSemFlecha(){
        int mes = 2;
        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3){
            System.out.println("Abril");
        } else if (mes == 4){
            System.out.println("Maio");
        } else if (mes == 5){
            //...
        }
}
    private static void ifFerias(){
        String  mes = "Julho";
        if (mes  == "Julho" || mes == "Dezembro" || mes == "Janeiro"){
            System.out.println("Ferias");
    }

}

    private static void switchSemana(){
        String dia  = "Terça";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
             case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
            System.out.println("Dia inválido!!!");
            break;
        }
       
    }
    private static void switchNumero(){
            int numero = 4;
            switch (numero){
                case 1:
                case 2:
                case 3:
                    System.out.println("certo");
                    break;
                case 4:
                    System.out.println("errado");
                    break;
                case 5:
                    System.out.println("Talvez");
                    break;
                default:
                System.out.println("Valor indefinido");
                    break;
            }
    }
    private static void switchFerias(){
        String mes = "Dezembro";
        switch (mes){
            case "Dezembro":
            case "Julho":
            case "Janeiro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Mes indefinido");
                break;
        }
    }
}
