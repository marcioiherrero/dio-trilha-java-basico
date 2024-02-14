package br.com.dio.java.io;

import java.io.*;
import java.util.Scanner;

//Abra o teclado para escrever 3 filmes que você recomendaria e armazene em "recomendados.txt"
public class Exercicio2_IOCaracter {
    
    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }
    
    public static void lerTecladoEscreverDocumento() throws IOException {
        
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendacoes de filmes: ");
        pw.flush();
        
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        File f = new File("recomendacoes.txt");
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));
        
        do {
            bw.write(line);
            bw.newLine();
            line = scanner.nextLine();
        } while (!line.equalsIgnoreCase("fim"));
        
        bw.flush();
        
        pw.printf("Arquivo \"%s\" foi criado com sucesso!", f.getName());
        
        bw.close();
        scanner.close();
        pw.close();
        
    }
    
}
