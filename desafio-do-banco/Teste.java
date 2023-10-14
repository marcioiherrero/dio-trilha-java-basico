public class Teste {
    
    public static void main(String[] args) {
        
        Cliente marcio = new Cliente();
        marcio.setNome("Marcio");
        
        Conta cc = new ContaCorrente(marcio);
        Conta poupanca = new ContaPoupanca(marcio);
        
        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }
    
}
