public class IPod implements ReprodutorMusical {
    
    @Override
    public void tocar() {
        System.out.println("Tocando musica do IPod");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando musica do IPod");
    }
    
    @Override
    public void selecionarMusica() {
        System.out.println("selecionando musica do Ipod");
    }
    
}
