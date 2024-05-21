import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero de sua conta bancaria: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero de sua agencia bancaria: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o saldo da sua conta bancaria: ");
        double saldoConta = scanner.nextDouble();

        exibeMenu(nomeCliente, numeroAgencia, numeroConta, saldoConta);
        scanner.close();

    }

    public static void exibeMenu(String nomeCliente, String numeroAgencia, int numeroConta, double saldoConta) {

        System.out.println(
                "Ola " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agencia e" + numeroAgencia
                        + ",conta " + numeroConta + "e seu saldo " + saldoConta + " ja está disponivel para saque.");

    }

}
