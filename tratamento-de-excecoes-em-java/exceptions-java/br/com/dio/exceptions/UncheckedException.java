package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    
    public static void main(String[] args) {
        
        boolean continuaLoop = true;
        
        do {
            
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            
            try {
                
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continuaLoop = false;
                
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Valor inválido. Informe um valor correto." + e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por zero.");
            } finally {
                System.out.println("Chegou no finally!");
            }
            
        } while (continuaLoop);
        
        System.out.println("O codigo continua...");
    }
    
    private static int dividir(int a, int b) {
        return a / b;
    }
    
}
