package br.com.dio.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ExemploMap {
    
    public static void main(String[] args) {
        
        //Dado os modelos dos carros e seus respectivos consumos ma estrada, faça:
        //modelo = gol  / consumo = 14.4 km/l
        //modelo = uno  / consumo = 15.6 km/l
        //modelo = mobi / consumo = 16.1 km/l
        //modelo = hb20 / consumo = 14.5 km/l
        //modelo = kwid / consumo = 15.6 km/l
        
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);
        
        System.out.println("Substitua o consumo do gol por 15.2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        
        System.out.println("Confira se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("tucson"));
        
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        
        //System.out.println("Exiba o terceiro modelo adicionado:");
        //Map não trabalha com índices
        
        System.out.println("Exiba os modelos:");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        
        System.out.println("Exiba o consumo dos carros:");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);
        
        System.out.println("Exiba o modelo mais economico e seu consumo:");
        Double consumoMaisEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for (Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEconomico)) {
                String modeloMaisEconomico = entry.getKey();
                System.out.println("Modelo mais economico: " + modeloMaisEconomico + " - " + consumoMaisEconomico);
            }
        }
        
        System.out.println("Exiba o modelo menos economico e seu consumo:");
        Double consumoMenosEconomico = Collections.min(carrosPopulares.values());
        for (Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEconomico)) {
                String modeloMenosEconomico = entry.getKey();
                System.out.println("Modelo menos economico: " + modeloMenosEconomico + " - " + consumoMenosEconomico);
            }
        }
        
        System.out.println("Exiba a soma dos consumos:");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double somaConsumo = 0.0;
        while (iterator.hasNext()) {
            somaConsumo += iterator.next();
        }
        System.out.println("A soma dos consumos e: " + somaConsumo);
        
        System.out.println("Exiba a media de consumo deste dicionario de carros: " + somaConsumo / carrosPopulares.size());
        
        System.out.println("Remova os modelos com o consumo igual a 15.6 km/k:");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals(15.6))
                iterator2.remove();
        }
        System.out.println(carrosPopulares);
        
        System.out.println("Exiba todos os carros na ordem em que foram informados:");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);            
        }};
        System.out.println(carrosPopulares2);
        
        System.out.println("Exiba o dicionario ordenado pelo modelo:");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);
        
        System.out.println("Apague o dicionario de carros:");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        
        System.out.println("Confira se o dicionario esta vazio: " + carrosPopulares.isEmpty());
        
    }
    
}