package br.com.dio.java.io.IOData;

import java.io.*;

@SuppressWarnings("InfiniteLoopStatement")
public class TesteIOData {
    
    static final String dataFile = "invoicedata.dat";
    
    static final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
    static final int[] units = {12, 8, 13, 29, 50};
    static final String[] descs = {"Camiseta", "Canceca", "Boneco", "Broche", "Chaveiro"};
    
    public static void main(String[] args) throws IOException {
        gravar();
        ler();
    }
    
    private static void ler() throws IOException {
        double total = 0.0;
        
        try (DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                double price = in.readDouble();
                int unit = in.readInt();
                String desc = in.readUTF();
                System.out.format("Voce pediu %d unidades de %s por $%.2f - subtotal: %.2f%n", unit, desc, price, (unit * price));
                total += (unit * price);
            }
        } catch (EOFException e) {
            System.out.format("fim de arquivo%n");
            System.out.format("Total $%.2f%n", total);
        }
    }
    
    private static void gravar() throws IOException {
        DataOutputStream out = new DataOutputStream(
                                        new BufferedOutputStream(
                                                new FileOutputStream(dataFile)));

        for (int i = 0; i < prices.length; i ++) {
            out.writeDouble(prices[i]);
            out.writeInt(units[i]);
            out.writeUTF(descs[i]);
            out.flush();
        }
        
        out.close();
    }
}
