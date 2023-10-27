package one.digitalinnovation;

public class No {
    
    private int dado;
    private No refProximoNo = null;

    public No() {

    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(No refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }
    
}
