package one.digitalinnovation.junit;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    
    @Test
    public void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        
        //Com importação estática da classe Assertions, podemos chamar diretamente os métodos ao
        //invés de chamar Asssertions.assertEquals, Assertions.assertArrayEquals, etc...
        assertArrayEquals(primeiroLancamento, segundoLancamento);
        
        //Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }
    
    @Test
    public void validarObjetoEstahNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);
        //Assertions.assertNull(pessoa);
        
        //pessoa = new Pessoa("Marcio", LocalDateTime.now());
        //Assertions.assertNotNull(pessoa);
    }
    
    @Test
    public void validarNumerosDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;
        
        assertEquals(valor, outroValor);
        //Assertions.assertEquals(valor, outroValor);
    }
}
