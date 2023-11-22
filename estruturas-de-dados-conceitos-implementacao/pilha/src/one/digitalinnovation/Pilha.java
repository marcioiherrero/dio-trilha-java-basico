package one.digitalinnovation;

public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No pop() {
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefProximoNo();
            return noPoped;
        }
        return null;
    }
    
    public void push(No novoNo) {
        No refNoAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefProximoNo(refNoAuxiliar);
    }
    
    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "-------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "-------------\n";
        
        No refNoAuxiliar = refNoEntradaPilha;

        while(true) {
            if(refNoAuxiliar != null) {
                stringRetorno += "No [dado=" + refNoAuxiliar.getDado() + "]\n";
                refNoAuxiliar = refNoAuxiliar.getRefProximoNo();
            } else {
                break;
            }
        }

        stringRetorno += "=============\n";
        return stringRetorno;
    }

}
