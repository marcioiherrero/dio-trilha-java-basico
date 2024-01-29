import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.print("Digite seu nome: ");
            String nome = scanner.next();
            
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();
            
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();
            
            System.out.println("Ola, seu nome eh: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Sua idade eh: " + idade + " anos");
            System.out.println("Sua altura eh: " + altura + " cm");
            
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numericos");
        } finally {
            scanner.close();
        }
        
    }
    
}
