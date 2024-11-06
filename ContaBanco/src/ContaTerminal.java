import java.nio.charset.Charset;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        System.setProperty("file.encoding", "UTF-8");
        // TODO: conhecer e importar a classe Scanner
        Scanner scan = new Scanner(System.in, "UTF-8");

        // TODO: Exibe a mensagem para o nosso Scanner
        System.out.println("Sistema de Criação de Contas");

        // TODO: Obter pelo Scanner os valores digitados no terminal

        System.out.print("Por favor, digite o número da Agência:");
        String agencia = scan.nextLine();

        System.out.print("Usuário:");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.print("Nome do Cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.print("Saldo Inicial: ");
        Double saldo =  scan.nextDouble();
        scan.nextLine();

        //TODO: Exibe a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
