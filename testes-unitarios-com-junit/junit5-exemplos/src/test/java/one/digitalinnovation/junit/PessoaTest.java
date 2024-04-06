package one.digitalinnovation.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class PessoaTest {
    
    @Test
    public void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0));
        Assertions.assertEquals(24, jessica.getIdade());
    }
    
    @Test
    public void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
        
        Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
    
}
