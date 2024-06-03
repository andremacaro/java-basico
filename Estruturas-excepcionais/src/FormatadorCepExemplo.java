public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237650641");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Cep inválido!");
        }
    }

    public static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        //Simulando um cep formatado
        return "23.765-064";
    }
    
    
}
