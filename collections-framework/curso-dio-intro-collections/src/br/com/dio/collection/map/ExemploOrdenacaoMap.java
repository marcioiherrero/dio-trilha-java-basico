package br.com.dio.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {
    
    public static void main(String[] args) {
        
        //Dado as seguintes informações sobre meus livros favoritos e seus autores,
        //crie um dicionário e ordene:
        //exibindo (Nome Autor - Nome Livro)
        
        //Autor: Hawking, Stephen   - Livro: Uma breve história do tempo - Páginas: 256
        //Autor: Duhigg, Charles    - Livro: O poder do hábito           - Páginas: 408
        //Autor: Harari, Yuval Noah - Livro: 21 lições para o século 21  - Páginas: 432
        
        
        System.out.println("---\tOrdem aleatoria\t---");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhhig, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes para o seculo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        
        System.out.println("---\tOrdem de insercao\t---");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhhig, Charles", new Livro("O poder do habito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes para o seculo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        
        System.out.println("---\tOrdem alfabetica - autores\t---");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
        for (Map.Entry<String, Livro> livro : meusLivros3.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        
        System.out.println("---\tOrdem alfabetica - nome dos livros\t---");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        
        System.out.println("---\tOrdem alfabetica - numero de paginas\t---");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorNumPaginas());
        meusLivros5.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros5) {
            System.out.println(livro.getValue().getPaginas() + " pgs - " + livro.getKey() + " - " + livro.getValue().getNome());
        }
        
    }
    
}

class Livro {
    
    private String nome;
    private Integer paginas;
    
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro other = (Livro) obj;
        return nome.equals(other.nome) && paginas.equals(other.paginas);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }
    
    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getPaginas() {
        return paginas;
    }
    
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {
    
    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
    
}

class ComparatorNumPaginas implements Comparator<Map.Entry<String, Livro>> {
    
    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
    
}
