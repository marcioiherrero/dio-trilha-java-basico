public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no IPhone");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no IPhone");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no IPhone");
    }
    
    @Override
    public void ligar() {
        System.out.println("Ligando o IPhone");
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo o IPhone");
    }
    
    @Override
    public void inicarCorreioVoz() {
        System.out.println("Iniciando o correio de voz no IPhone");
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando o IPhone");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando o IPhone");
    }
    
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado musica no IPhone");
    }
    
}
