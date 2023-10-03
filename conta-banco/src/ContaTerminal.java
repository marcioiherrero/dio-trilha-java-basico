import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(System.in);
            
            System.out.println("==== BANCO XYZ S/A, seja bem-vindo! ====");
            
            System.out.print("Por favor, digite seu nome: ");
            String nomeCliente = scanner.next();
            
            System.out.print("Por favor, digite o numero da agencia: ");
            int agencia = scanner.nextInt();
            
            System.out.print("Por favor, digite o numero da conta: ");
            int numero = scanner.nextInt();
            
            System.out.print("Por favor, digite o saldo inicial: ");
            double saldo = scanner.nextDouble();
            
            System.out.println("");
            System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta conosco!");
            System.out.println("Agencia: " + agencia);
            System.out.println("Conta: " + numero);
            System.out.println("Seu saldo de R$ " + saldo + " ja esta disponivel para saque!");
            System.out.println("Muito obrigado por utilizar nossos servicos!");
            
        } finally {
            scanner.close();
        }
        
    }
    
}
