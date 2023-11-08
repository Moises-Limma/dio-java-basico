import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite o número da agência:");
            int numero = scanner.nextInt();

            System.out.println("Digite a agência:");
            String agencia = scanner.next();

            System.out.println("Digite seu saldo:");
            double saldo = scanner.nextDouble();

            scanner.close();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            
    }

}
