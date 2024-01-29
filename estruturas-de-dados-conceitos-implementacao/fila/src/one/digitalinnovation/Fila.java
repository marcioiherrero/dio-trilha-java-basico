package one.digitalinnovation;

public class Fila<T> {
    
    private No<T> refNoEntradaFila;
    
    public Fila() {
        this.refNoEntradaFila = null;
    }
    
    public boolean isEmpty() {
        return this.refNoEntradaFila == null;
    }
    
    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefProxNo() != null) {
                    primeiroNo = primeiroNo.getRefProxNo();
                } else {
                    break;
                }
            }
            return primeiroNo.getObject();
        }
        return null;
    }
    
    public void enqueue(T object) {
        No<T> novoNo = new No<T>(object);
        novoNo.setRefProxNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    
    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAux = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefProxNo() != null) {
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefProxNo();
                } else {
                    noAux.setRefProxNo(null);
                    break;
                }
            }
            
            return primeiroNo.getObject();
        }
        return null;
    }
    
    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;
        
        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefProxNo() != null) {
                    noAuxiliar = noAuxiliar.getRefProxNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        
        return stringRetorno;
    }
    
}
