import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = input.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = input.next();

            System.out.println("Digite sua altura: ");
            Double altura = input.nextDouble();

            System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
        }
        catch(Exception InputMismatchException){
            System.err.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}