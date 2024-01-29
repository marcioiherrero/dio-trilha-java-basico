public class FormatadorCEPExemplp {
    
    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("12678");
            System.out.println(cepFormatado);
        } catch (CEPInvalidoException e) {
            System.err.println("O CEP deve ter no minimo 8 caracteres");
        }
        
    }
    
    static String formatarCep(String cep) throws CEPInvalidoException {
        if (cep.length() != 8) {
            throw new CEPInvalidoException();
        }
        return "01111-111";
    }
    
}
