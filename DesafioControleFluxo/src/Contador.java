import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int parametro1 = input.nextInt();
        int parametro2 = input.nextInt();

        try{
            contar(parametro1, parametro2);
        }
        catch(ParametrosInvalidosException Exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = parametro2 - parametro1;
            for(int i = 1; i <= contagem; i++){
                System.out.println(i);
            }
        }
    }
    
}
