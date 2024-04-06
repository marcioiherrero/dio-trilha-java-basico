package one.digitalinnovation.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class ConultarDadosTest {
    
    @BeforeAll
    public static void configurarConexao() {
        BancoDeDados.iniciarConexao();
    }
    
    @BeforeEach
    public void insereDados() {
        BancoDeDados.insereDados();
    }
    
    @AfterEach
    public void removeDados() {
        BancoDeDados.removeDados();
    }
    
    @Test
    public void validarDados1() {
        Assertions.assertTrue(true);
    }
    
    @Test
    public void validarDados2() {
        Assertions.assertNull(null);
    }
    
    @AfterAll
    public static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
