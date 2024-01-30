package br.com.dio.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
        
        double media = calculaMediaDaTurma(alunos, scan);
        
        System.out.printf("Media da turma %.2f", media);
        
    }
    
    static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        
        double soma = 0;
        
        for (String aluno : alunos) {
            System.out.println("Nota do aluno %s: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        
        return soma / alunos.length;
        
    }
    
}
