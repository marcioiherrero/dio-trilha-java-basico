package one.digitalinnovation.junit;

import java.util.logging.Logger;

public class BancoDeDados {
    
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    
    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexao");
    }
    
    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexao");
    }
    
    public static void insereDados() {
        LOGGER.info("Inseriu dados");
    }
    
    public static void removeDados() {
        LOGGER.info("Removeu dados");
    }
    
}
