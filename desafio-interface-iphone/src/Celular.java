public class Celular implements AparelhoTelefonico {
    
    @Override
    public void ligar() {
        System.out.println("Ligando o Celular");
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo o Celular");
    }
    
    @Override
    public void inicarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Celular");
    }
    
}
