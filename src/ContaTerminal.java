import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) {
        
        // usando try-with-resources para evitar vazamento de recursos
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("=========BANCO======");

            System.out.println("Digite seu nome: ");
            String userName = scanner.next();

            System.out.println("Digite o número da sua agência: ");
            String agencyNumber = scanner.next();

            System.out.println("Digite o número da sua conta: ");
            int accountNumber = scanner.nextInt();

            System.out.println("Digite o seu saldo: ");
            double bankBalance = scanner.nextDouble();

            System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque", userName, agencyNumber, accountNumber, bankBalance));
        }

    }
    
}
