package br.com.dio.java.io.IOBytes;

import java.io.*;

public class ExemploIOBytes {
    
    public static void copiarArquivo() throws IOException {
        File f = new File("recomendacoes-copy.txt");
        String nomeArquivo = f.getName();
        
        //InputStream is = new FileInputStream(nomeArquivo);
        //BufferedInputStream bis = new BufferedInputStream(is);
        //Decorator
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo));
        
        String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy-IOBytes.txt");
        File fCopia = new File(nomeArquivoCopia);
        
        //OutputStream os = new FileOutputStream(nomeArquivoCopia);
        //BufferedOutputStream bos = new BufferedOutputStream(os);
        //Decorator
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopia));
        
        //processo de leitura a cada 1024 bytes:
        byte[] buffer = new byte[1024];
        int line;
        while ((line = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, line);
            bos.flush();
        }
        
        // processo de leitura byte a byte:
        //int line;
        //while ((line = bis.read()) != -1) {
        //    bos.write(line);
        //    bos.flush();
        //}
        
        bis.close();
        bos.close();
        
        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e tem %d bytes.", nomeArquivoCopia, fCopia.length());
    }
    
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
    
}
