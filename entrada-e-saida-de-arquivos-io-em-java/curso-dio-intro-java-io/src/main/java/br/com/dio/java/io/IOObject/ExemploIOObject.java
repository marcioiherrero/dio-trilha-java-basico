package br.com.dio.java.io.IOObject;

import java.io.*;

//1. Crie a classe Gato com os atributos: nome, idade e cor.
//2. Instancie um objeto da classe Gato e serialize no arquivo "gato.obj".
//3. Desserialize esse objeto (lendo do arquivo "gato.obj" criado) e exiba no console.
public class ExemploIOObject {
    
    public static void serializacao() throws IOException {
        Gato gato = new Gato("Gatinho feio", 2, "Azul");
        
        File file = new File("gato.obj");
        
        //OutputStream os = new FileOutputStream(file.getName());
        //ObjectOutputStream oos = new ObjectOutputStream(os);
        //Decorator
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getName()));
        
        oos.writeObject(gato);
        
        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s gerado com sucesso com %d bytes.\n", file.getName(), file.length());
        
        oos.close();
        ps.close();
    }
    
    private static void desserializacao() {
        
    }
    
    public static void main(String[] args) throws IOException {
        serializacao();
        desserializacao();
    }
    
}
