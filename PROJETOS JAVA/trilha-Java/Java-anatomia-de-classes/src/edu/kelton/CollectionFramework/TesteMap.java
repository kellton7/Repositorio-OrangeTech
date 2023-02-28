package edu.kelton.CollectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class testeMap{
public static void main(String[] args) {
    
    System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos: ");

    Map<String, Double> carrosPopulares = new HashMap<>(){{
        put("Gol", 14.4);
        put("Uno", 20.8);
        put("Hb20", 30d);
        put("Nissan", 2.3);
        put("R35", 50d);
        put("Mobi", 23.1);
    }};
    System.out.println(carrosPopulares);

    System.out.println("Substitua o consumo do 'Gol' por 15.2 km/l: ");
    carrosPopulares.put("Gol", 15.2);

    System.out.println(carrosPopulares);

    System.out.println("Confira se o modelo tuscon está no dicionario: " + carrosPopulares.containsKey("Tuscon"));

    System.out.println("Exiba o consumo do Gol: " + carrosPopulares.get("Uno"));

    //System.out.println("Exiba o terceiro modelo adicionado: "); n tem como no map

    System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

    System.out.println("Exiba os comsumos dos carros: ");
    Collection<Double> consumos = carrosPopulares.values();
    System.out.println(consumos);

    System.out.println("Exiba o modelo mais economico: ");
    Double consumoMaisEconomico = Collections.max(carrosPopulares.values());
    Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
    String modeloMaisEficiente = "";

    for (Map.Entry<String, Double> entry: entries) {
        if(entry.getValue().equals(consumoMaisEconomico)) {
            modeloMaisEficiente = entry.getKey();    
            System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEconomico);
        }
    }

    System.out.println("Exiba o modelo menos economico: ");
    Double ConsumoMenosEficientee = Collections.min(carrosPopulares.values());
    String modeloMenosEficiente = "";
    for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
        if (entry.getValue().equals(ConsumoMenosEficientee)) {
        modeloMenosEficiente = entry.getKey();
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + ConsumoMenosEficientee);
        }
    } 

    Iterator<Double> iterator = carrosPopulares.values().iterator();
    double soma = 0d;
    while (iterator.hasNext()){
        soma += iterator.next();
    }
    System.out.println("Exiba a soma dos consumos: " + soma);

    System.out.println("Exiba a media de consumo do dicionario: " + (soma/carrosPopulares.size()));

    System.out.println("Remova os modelos com o consumo igual a 15,2 km/l");
    System.out.println(carrosPopulares);
    Iterator<Double> iterator1 = carrosPopulares.values().iterator();
    while (iterator1.hasNext()){
        if(iterator1.next().equals(15.2)) iterator1.remove();
    }
    System.out.println(carrosPopulares);

    System.out.println("Exiba todos os carros na ordem que foram informados: ");
    Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
        put("Gol", 14.4);
        put("Uno", 20.8);
        put("Hb20", 30d);
        put("Nissan", 2.3);
        put("R35", 50d);
        put("Mobi", 23.1);
    }};
    System.out.println(carrosPopulares1);

    System.out.println("Exiba o dicionario ordenado pelo modelo: ");
    Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1){{
        put("Gol", 14.4);
        put("Uno", 20.8);
        put("Hb20", 30d);
        put("Nissan", 2.3);
        put("R35", 50d);
        put("Mobi", 23.1);
    }};
    System.out.println(carrosPopulares2);

    System.out.println("Apague o dicionario de carros: ");
    carrosPopulares.clear();

    System.out.println("Confira se a lista carros esta vazia: " + carrosPopulares.isEmpty());
    System.out.println("Confira se a lista 1 carros esta vazia: " + carrosPopulares1.isEmpty());
    System.out.println("Confira se a lista 2 carros esta vazia: " + carrosPopulares2.isEmpty());


}
}