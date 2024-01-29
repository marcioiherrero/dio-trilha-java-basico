package com.projetono;

public class No<T> {
    
    private T conteudo;
    private No<T> proximo;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximo;
    }

    public void setProximoNo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
    
}
