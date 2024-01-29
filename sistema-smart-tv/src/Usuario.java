public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTV smartTV = new SmartTV();
        
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        
        smartTV.mudarCanal(13);
        
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        
        smartTV.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada);
        
        smartTV.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTV.ligada);
        
    }
    
}
