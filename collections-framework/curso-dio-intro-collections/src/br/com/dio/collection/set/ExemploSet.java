package br.com.dio.collection.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    
    public static void main(String[] args) {
        
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);
        
        //Set não tem como trabalhar com posição de elementos no conjunto
        //System.out.println("Exiba a posição da nota 5.0: ");
        
        //Set não tem como trabalhar com posição de elementos no conjunto
        //System.out.println("Adicione na Lista a nota 8.0 na posição 4: ");
        
        //Set não tem como trabalhar com posição de elementos no conjunto
        //System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        
        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));
        
        //Set não tem como trabalhar com posição de elementos no conjunto
        //System.out.println("Exiba a terceira nota adicionada: ");
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores das notas: " + String.format("%.2f", soma));
        
        System.out.println("Exiba a media das notas: " + String.format("%.2f", (soma / notas.size())));
        
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        
        //Set não tem como trabalhar com posição de elementos no conjunto
        //System.out.println("Remova a nota da posicao 0: ");
        
        System.out.println("Remova as notas menores que 7 e exiba a Lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();
        }
        System.out.println(notas);
        
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
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
        
        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println(notas);
        
        System.out.println("Confira se o conjunto esta vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto2 esta vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto3 esta vazio: " + notas3.isEmpty());
        
    }
    
}
