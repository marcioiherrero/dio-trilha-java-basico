package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    
    public static void main(String[] args) throws Exception {
        
        //ArrayList<Double> notas = new ArrayList<>();
        //Recomendado na medida do possível programar sempre para uma interface
        //ao invés de programar para uma classe.
        //List -> Interface
        //ArrayList -> Classe
        
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
        
        System.out.println("Adicione na Lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        
        System.out.println("Confira se a nota 5.0 esta na Lista: " + notas.contains(5.0));
        
        System.out.println("Exiba todas as notas na ordem em foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }
        
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        System.out.print("Exiba a soma dos valores das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        
        System.out.println("Exiba a media das notas: " + soma / notas.size());
        
        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);
        
        System.out.println("Remova a nota da posicao 0: ");
        notas.remove(0);
        System.out.println(notas);
        
        System.out.println("Remova as notas menores que 7 e exiba a Lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();
        }
        System.out.println(notas);
        
        System.out.println("Apague toda a Lista: ");
        notas.clear();
        System.out.println(notas);
        
        System.out.println("Confira se a Lista esta vazia: " + notas.isEmpty());
        
        //Exercicios:
        //Resolva esses exercicos utiizando os métodos da implementação LinkedList:
        
        System.out.println("Crie uma Lista chamada notas2 e coloque todos os elementos da List ArrayList nessa nova Lista:");
        List<Double> notas2 = new LinkedList<>();
        Iterator<Double> iterator3 = notas2.iterator();
        while (iterator3.hasNext()) {
            notas2.add(iterator3.next());
        }
        System.out.println(notas2);
        
        System.out.println("Mostre a primeira nota da nova Lista sem remove-la:");
        System.out.println(notas2.getFirst());
        
        System.out.println("Mostre a primeira nota da nova Lista removendo-o:");
        System.out.println(notas2.removeFirst());
        
    }
    
}
