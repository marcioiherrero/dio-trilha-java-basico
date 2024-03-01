package br.com.dio.java.io.IOCharacter;

import java.io.*;

public class Exercicio3_IOCharacter {
    
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
    
    public static void copiarArquivo() throws IOException {
        File f = new File("recomendacoes.txt");
        String nomeDoArquivo = f.getName();
        
        BufferedReader br = new BufferedReader(new FileReader(nomeDoArquivo));
        String line = br.readLine();
        
        String nomeDoArquivoNovo = nomeDoArquivo.substring(0, nomeDoArquivo.indexOf(".")).concat("-copy.txt");
        
        File fnovo = new File(nomeDoArquivoNovo);
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(nomeDoArquivoNovo));
        
        do {
            bw.write(line);
            bw.newLine();
            // flush() faz o Buffer "descarregar" os bytes no arquivo...
            // é bom ir "descarregando" os bytes em arquivo parcialmente com o flsuh()
            // para não perder dados, caso fique algum dado para trás..
            // quando o arquivo é pequeno, o flush() pode ser chamado no final do processo mas
            // com arquivos grandes é interessante fazer o flush() parcialemnte.
            bw.flush();
            line = br.readLine();
        } while (line != null);
        
        System.out.printf("Arquivo \"%s\" copiado com sucesso! '%d' bytes. \n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! '%d' bytes. \n", fnovo.getName(), fnovo.length());
        
        
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();
        
        adicionarInfoNoArquivo(fnovo.getName());
        
        pw.printf("Ok, tudo certo. Tamanho do arquivo: '%d' bytes. \n", fnovo.length());
        
        br.close();
        bw.close();
        pw.close();
    }
    
    public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
        
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!line.equalsIgnoreCase("fim"));
        
        bw.flush();
        bw.close();
        br.close();
    }
}
