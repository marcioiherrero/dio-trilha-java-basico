public class Safari implements NavegadorInternet {
    
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no Safari");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Safari");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no Safari");
    }
    
}
