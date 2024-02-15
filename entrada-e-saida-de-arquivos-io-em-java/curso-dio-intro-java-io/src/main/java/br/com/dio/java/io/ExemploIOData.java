package br.com.dio.java.io;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Scanner;

//Crie um arquivo "peca-de-roupa.bin" e armazene:
//  -Nome do produto
//  -Tamanho do produto (P/M/G/U)
//  -Quantidade
//  -Preço
//Leia este arquivo e imprima no console.

public class ExemploIOData {
    
    public static void incluirProduto() throws IOException {
        File file = new File("peca-de-roupa.bin");
        
        PrintStream ps = new PrintStream(System.out);
        ps.flush();
        
        //OutputStream os = new FileOutputStream(file.getName());
        //DataOutputStream dos = new DataOutputStream(os);
        //Decorator
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file.getName()));
        
        Scanner scanner = new Scanner(System.in);
        
        ps.print("Nome da peca: ");
        String nomePeca = scanner.nextLine();
        dos.writeUTF(nomePeca);
        
        ps.print("Tamanho da peca: ");
        char tamanhoPeca = scanner.nextLine().charAt(0);
        dos.writeChar(tamanhoPeca);
        
        ps.print("Quantidade: ");
        int quantPecas = scanner.nextInt();
        dos.writeInt(quantPecas);
        
        ps.print("Preco: ");
        double precoPeca = scanner.nextDouble();
        dos.writeDouble(precoPeca);
        
        ps.printf("O arquivo %s foi criado com sucesso com %d bytes.\n", file.getName(), file.length());
        
        lerProduto(file.getName());
        
        dos.close();
        scanner.close();
        ps.close();
    }
    
    public static void lerProduto(String arquivo) throws IOException {
        File file = new File(arquivo);
        
        //InputStream is = new FileInputStream(file.getName());
        //DataInputStream dis = new DataInputStream(is);
        //Decorator
        DataInputStream dis = new DataInputStream(new FileInputStream(file.getName()));
        
        String nomePeca = dis.readUTF();
        char tamanhoPeca = dis.readChar();
        int quantPecas = dis.readInt();
        double precoPeca = dis.readDouble();
        
        System.out.printf("\nNome.......................: %s", nomePeca);
        System.out.printf("\nTamanho....................: %s", tamanhoPeca);
        System.out.printf("\nQuantidade.................: %d", quantPecas);
        System.out.printf("\nPreco......................: %f", precoPeca);
        System.out.printf("\nTotal valor das pecas: ====> %f\n", (quantPecas * precoPeca));
        
        dis.close();
    }
    
    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
    
}
