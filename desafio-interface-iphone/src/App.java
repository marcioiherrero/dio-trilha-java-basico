public class App {
    
    public static void main(String[] args) throws Exception {
        
        IPhone iphone = new IPhone();
        
		ReprodutorMusical repMusical = iphone;
		AparelhoTelefonico apTelefonico = iphone;
		NavegadorInternet navInternet = iphone;
		
		repMusical.tocar();
        apTelefonico.ligar();
        navInternet.exibirPagina();
        
    }
    
}
