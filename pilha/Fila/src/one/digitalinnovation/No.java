package one.digitalinnovation;

public class No<T> {
    
    private T object;
    private No<T> refProxNo;
    
    public No() {
        
    }
    
    public No(T object) {
        this.refProxNo = null;
        this.object = object;
    }
    
    public T getObject() {
        return object;
    }
    
    public void setObject(T object) {
        this.object = object;
    }
    
    public No<T> getRefProxNo() {
        return refProxNo;
    }
    
    public void setRefProxNo(No<T> refProxNo) {
        this.refProxNo = refProxNo;
    }
    
    @Override
    public String toString() {
        return "No[object=" + object + "]";
    }
    
}
