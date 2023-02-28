package edu.kelton.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class TesteList{
    public static void main(String[] args) {
        //Lista com 7 notas de um aluno [8, 4.5, 5.7, 6.4 , 8,10]

        System.out.println("Crie uma lista e adicione as 7 notas: ");
        List <Double> notas = new ArrayList<>();
        notas.add(8d);
        notas.add(5d);
        notas.add(9.7);
        notas.add(4.6);
        notas.add(7d);
        notas.add(10d);
        notas.add(8.5);

        System.out.println(notas);

        System.out.println("Qual a posição nota 8.5: " + notas.indexOf(8.5));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Subtitua a nota 10 pela nota 0: ");
        notas.set(notas.indexOf(10d), 0.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 9.7 está na list: " + notas.contains(9.7));

        System.out.println("Mostre todas as notas na ordem que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota add: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a manior nota: " + Collections.max(notas));

        
        Iterator<Double> iterator = notas.iterator();

        double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //se colocar 0 ele remove na posição 0. 0d remove a nota 0
        System.out.println(notas);

        System.out.println("Remova a nota 0 da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores de 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        
    }
}