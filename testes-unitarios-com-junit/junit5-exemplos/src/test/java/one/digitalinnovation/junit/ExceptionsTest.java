package one.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    
    @Test
    public void validarCenarioDeExcecaoNaTransferencia() {
        
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);
        
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1);
        });
        
        //Assertions.assertDoesNotThrow(() -> {
        //transferenciaEntreContas.transfere(contaOrigem, contaDestino, 10);
        //});
    }
}
