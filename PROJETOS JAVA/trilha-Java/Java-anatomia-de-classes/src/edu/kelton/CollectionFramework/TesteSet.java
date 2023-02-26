package edu.kelton.CollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
    public static void main(String[] args) {
    
        System.out.println("Crie uma conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //System.out.println("Qual a posição nota 5:"); nao tem como no metodo Set

        //System.out.println("Adicione na lista a nota 8.0 na posição 4: "); nao tem como no metodo Set

        //System.out.println("Subtitua a nota 5 pela nota 6: "); nao tem como no metodo Set
        
        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

        //System.out.println("Exiba a terceira nota add:"); nao tem como no metodo 
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> Iterator = notas.iterator();
        Double soma = 0.0;
        while(Iterator.hasNext()) {
            Double next = Iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: ");

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //System.out.println("Remova a nota 0 da posição 0: ");nao tem como no metodo Set

        System.out.println("Remova as notas menores de 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2   = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague toda o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazia: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazia: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazia: " + notas3.isEmpty());

    }
}
