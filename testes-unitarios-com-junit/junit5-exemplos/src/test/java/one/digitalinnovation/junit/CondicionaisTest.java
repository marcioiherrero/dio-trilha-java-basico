package one.digitalinnovation.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

public class CondicionaisTest {
    
    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_22)
    public void validarSomenteEntreJava11e17() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
}
