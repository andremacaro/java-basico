import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Definindo variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        //TODO: Conhecer e importar a classe Scanner
        Scanner input = new Scanner(System.in);

        //Exibir as mensagens para o usuário
        //Obter pela classe Scanner os valores digitados no terminal
        System.out.println("Digite o seu nome: ");
        nomeCliente = input.nextLine();
        System.out.println("Digite o número da agência: ");
        agencia = input.nextLine();
        System.out.println("Digite o número da conta: ");
        numero = input.nextInt();

        //Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de" + saldo + " já está disponível para saque.");

        input.close();
    }
}
