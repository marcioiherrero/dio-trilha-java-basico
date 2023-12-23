package br.com.dio.collection.streamAPI;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;

/*
Dadas as seguintes informações de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class RefatoracaoOrdenacaoMap {
    
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>() {{
           put(1, new Contato("Simba", 5555));
           put(4, new Contato("Cami", 1111));
           put(3, new Contato("Jon", 2222));
        }};
        
        
        System.out.println("--[Ordem número telefone - com classe anonima]--");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }
        
        
        System.out.println("--[Ordem número telefone - com interface funcional: Function<? super T, ? extends U>]--");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer, Contato>, Integer>() {
                @Override
                public Integer apply(Map.Entry<Integer, Contato> cont) {
                    return cont.getValue().getNumero();
                }
        }));
        set2.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set2) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }
        
        
        System.out.println("--[Ordem número telefone - com Lambda Expression]--");
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        set3.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set3) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }
        
    }
}
