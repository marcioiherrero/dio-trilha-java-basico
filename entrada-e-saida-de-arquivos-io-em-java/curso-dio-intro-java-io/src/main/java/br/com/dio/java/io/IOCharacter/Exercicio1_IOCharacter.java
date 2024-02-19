package br.com.dio.java.io.IOCharacter;

import java.io.*;

//Abra o teclado para escrever 3 filmes que você recomendaria e exiba esses filmes no console.
public class Exercicio1_IOCharacter {
    
    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }
    
    public static void receberTecladoImprimirConsole() throws IOException {
        //InputStream is = System.in;
        //InputStreamReader isr = new InputStreamReader(is);
        //BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Recomende 3 filmes: ");
        
        //padrão Decorator, simplifica tudo numa linha só...
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        //OutputStream os = System.out;
        //OutputStreamWriter osw = new OutputStreamWriter(os);
        //BufferedWriter bw = new BufferedWriter(osw);
        
        //padrão Decorator, simplifica tudo numa linha só...
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!line.isEmpty());
        bw.flush();
        
        br.close();
        bw.close();
    }
    
}
