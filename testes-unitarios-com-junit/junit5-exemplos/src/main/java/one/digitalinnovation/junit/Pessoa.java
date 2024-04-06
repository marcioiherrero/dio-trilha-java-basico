package one.digitalinnovation.junit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    
    private String nome;
    private LocalDateTime nascimento;
    
    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
    }
    
    public boolean ehMaiorDeIdade() {
        return getIdade() >= 18;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public LocalDateTime getNascimento() {
        return nascimento;
    }
    
    public void setNascimento(LocalDateTime nascimento) {
        this.nascimento = nascimento;
    }
    
}
