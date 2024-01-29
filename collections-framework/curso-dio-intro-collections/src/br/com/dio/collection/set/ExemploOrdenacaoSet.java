package br.com.dio.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    
    //Dadas as seguintes informações sobre minhas séries favoritas,
    //cire um conjunto e ordene este conjunto exibindo:
    //(nome - gênero - tempo de episódio):
    
    //Série 1: nome: got            - gênero: fantasia  - tempo de episódio: 60
    //Série 2: nome: dark           - gênero: drama     - tempo de episódio: 60
    //Série 3: nome: that ´70s show - gênero: comédia   - tempo de episódio: 25
    
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        
        
        System.out.println("--\tOrdem de insercao\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        
        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        
        
        System.out.println("--\tOrdem natural (tempoEpisodio)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        
        
        System.out.println("--\tOrdem Nome - Genero - Tempo Episodio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};
        
        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
        
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }
    
    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }
    
    @Override
    public String toString() {
        return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }
    
    @Override
    public int compareTo(Serie s) {
        Integer tempoEpisodio = Integer.compare(this.getTempoEpisodio(), s.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(s.getGenero());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome =  s1.getNome().compareToIgnoreCase(s2.getNome());
        if (nome != 0) return nome;
        
        int genero =  s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if (genero != 0) return genero;
        
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
    
}
