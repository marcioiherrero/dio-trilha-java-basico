package br.com.dio.java.io.IOObject;

import java.io.*;

//1. Crie a classe Gato com os atributos: nome, idade e cor.
//2. Instancie um objeto da classe Gato e serialize no arquivo "gato.obj".
//3. Desserialize esse objeto (lendo do arquivo "gato.obj" criado) e exiba no console.
public class ExemploIOObject {
    
    public static void serializacao() throws IOException {
        Gato gato = new Gato("Gatinho feio", 2, "Azul");
        gato.setSexo("Masculino");
        
        File file = new File("gato.obj");
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file.getName()));
        
        oos.writeObject(gato);
        
        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s gerado com sucesso com %d bytes.\n", file.getName(), file.length());
        
        oos.close();
        //ps.close();
    }
    
    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objGato = (Gato) ois.readObject();
        
        System.out.printf("Nome......: %s\n", objGato.getNome());
        System.out.printf("Idade.....: %d\n", objGato.getIdade());
        System.out.printf("Cor.......: %s\n", objGato.getCor());
        System.out.printf("Sexo......: %s\n", objGato.getSexo());
        System.out.println(objGato);
        
        ois.close();
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializacao();
        desserializacao("gato.obj");
    }
    
}
