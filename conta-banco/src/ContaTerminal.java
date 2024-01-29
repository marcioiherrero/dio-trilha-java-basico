import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        int agencia;
        int numero;
        String nomeCliente;
        double saldo;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("== [BANCO XYZ] Bem-vindo! ==");
        System.out.println("============================");
        
        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();
        
        System.out.print("Por favor, digite a agencia: ");
        agencia = scanner.nextInt();
        
        System.out.print("Por favor, digite a conta: ");
        numero = scanner.nextInt();
        
        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();
        
        System.out.println("");
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agencia: " + agencia);
        System.out.println("Sua conta: " + numero);
        System.out.println("Seu saldo " + saldo + " ja esta disponivel para saque.");
        System.out.println("");
        
        scanner.close();
        
    }
    
}
