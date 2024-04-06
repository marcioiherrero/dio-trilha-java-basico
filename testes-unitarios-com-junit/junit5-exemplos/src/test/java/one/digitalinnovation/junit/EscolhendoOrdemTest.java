package one.digitalinnovation.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTest {
    
    @Test
    @DisplayName("B")
    public void testFluxoA() {
        Assertions.assertTrue(true);
    }
    
    @Test
    @DisplayName("C")
    public void testFluxoB() {
        Assertions.assertTrue(true);
    }
    
    @Test
    @DisplayName("A")
    public void testFluxoC() {
        Assertions.assertTrue(true);
    }
    
}
