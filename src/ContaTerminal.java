import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- CONTA BANCÁRIA -----");

        System.out.println("Digite o número da Agência: ");
        var agencyNumber = scanner.nextInt();

        System.out.println("Digite a sua agência: ");
        var agency = scanner.next();
        scanner.nextLine();  // buffer

        System.out.println("Digite o seu nome: ");
        var userName = scanner.nextLine();

        System.out.println("Digite o saldo da sua conta: ");
        var balance = scanner.nextDouble();

        var resumeUserBankAccount = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque\n";
        System.out.printf(resumeUserBankAccount, userName, agency, agencyNumber, balance);

        scanner.close();
    }
}