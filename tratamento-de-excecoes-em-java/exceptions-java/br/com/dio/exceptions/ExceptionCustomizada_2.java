package br.com.dio.exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    
    public static void main(String[] args) {
        
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};
        
        for (int i = 0; i < denominador.length; i++) {
            
            try {
                if (numerador[i] %2 != 0) throw new DivisaoNaoExataException("Divisao nao exata!", numerador[i], denominador[i]);
            } catch (DivisaoNaoExataException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            int resultado = numerador[i] / denominador[i];
            System.out.println(resultado);
        }
        System.out.println("O programa continua...");
        
    }
    
}
