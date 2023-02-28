package edu.kelton.CollectionFramework;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioStreamApi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        var numerosAleatorios = Arrays.asList("1" , "0", "4", "1", "2", "3", "9", "9", "6", "5");
        
        System.out.println("Imprima todos os elemtos da Lista: ");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Peque os 5 últimos primeiros e coloque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet())
        .forEach(System.out::println);

        /*System.out.println("Trasforme esta lista de String em Inteiros: ");
        //numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList())
        .forEach(System.out::println);*/

        System.out.println("Pegue os numeros pares maiores que 2 e coloque em uma lista: ");
        List<Integer> ListParesMaiorr2 =
        numerosAleatorios.stream().map(Integer::parseInt).filter(integer -> integer % 2 == 0 && integer >2)
        .collect(Collectors.toList());
        System.out.println(ListParesMaiorr2);

        System.out.println("Mostre a média dos numeros: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average()
        .ifPresent(System.out::println);
            
        System.out.println("Remova os valores Impares: ");
        List<Integer> numAleatorio = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numAleatorio.removeIf(t -> t % 2  != 0);
        System.out.println(numAleatorio);
        }
}

