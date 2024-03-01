package br.com.dio.java.io.IOObject;

import java.io.Serializable;
import java.util.Objects;

public class Gato implements Serializable {
    
    //serialVersionUID: define versão do objeto na serialização.
    private static final long serialVersionUID = 2L;
    private String nome;
    private Integer idade;
    private String cor;
    //transient: ignora o atributo na serialização do objeto.
    private transient String sexo;
    
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getIdade() {
        return idade;
    }
    
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(idade, gato.idade) && Objects.equals(cor, gato.cor);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cor);
    }
    
}
