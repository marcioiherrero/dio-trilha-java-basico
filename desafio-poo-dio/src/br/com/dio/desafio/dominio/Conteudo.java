package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10.0;
    
    private String titulo;
    private String descricao;
    
    //método abstract que deve ser implementado nas classes filhas
    public abstract double calcularXP();
    
    public static double getXpPadrao() {
        return XP_PADRAO;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
