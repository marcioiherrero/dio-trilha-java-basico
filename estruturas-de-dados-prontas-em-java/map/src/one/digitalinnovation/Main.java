package one.digitalinnovation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Map<String, String> aluno1 = new HashMap<>();
        aluno1.put("Nome", "Joao");
        aluno1.put("Idade", "17");
        aluno1.put("Media", "8.5");
        aluno1.put("Turma", "3A");
        
        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3B");
        
        System.out.println(aluno1);
        System.out.println(aluno1.values());
        System.out.println(aluno1.keySet());
        
        System.out.println(aluno2);
        System.out.println(aluno2.values());
        System.out.println(aluno2.keySet());
        
        List<Map<String, String>> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        
        System.out.println(alunos);
        
        System.out.println(aluno1.containsKey("Nome"));
        
    }
    
}
