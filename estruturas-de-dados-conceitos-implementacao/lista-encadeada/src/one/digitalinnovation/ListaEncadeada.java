package one.digitalinnovation;

public class ListaEncadeada<T> {
    
    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }
    
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAux = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }
    
    public T get(int index) {
        return getNo(index).getConteudo();
    }
    
    public No<T> getNo(int index) {
        validaIndex(index);
        No<T> noAux = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }
    
    public T remove(int index) {
        No<T> noPivot = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivot.getProximoNo();
            return noPivot.getConteudo();
        }
        No<T> noAnterior = this.getNo(index - 1);
        noAnterior.setProximoNo(noPivot.getProximoNo());
        return noPivot.getConteudo();
    }
    
    public int size() {
        int tamanhoLista = 0;
        No<T> refAux = referenciaEntrada;
        while (true) {
            if (refAux != null) {
                tamanhoLista++;
                if (refAux.getProximoNo() != null) {
                    refAux = refAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }
    
    public boolean isEmpty() {
        return referenciaEntrada == null;
    }
    
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "No[conteudo=" + noAuxiliar.getConteudo() + "]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
    
    private void validaIndex(int index) {
        if (index >= this.size()) {
            int ultimoIndex = this.size()-1;
            throw new IndexOutOfBoundsException("Nao existe conteudo no indice: " + index +
                " desta lista. Esta lista soh vai ate o indice: " + ultimoIndex);
        }
    }
    
}
