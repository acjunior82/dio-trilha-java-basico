import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por Favor digite o número de sua AGENCIA");
        int agencia = scanner.nextInt();


        System.out.println("Por Favor digite o número de sua CONTA");
        int conta = scanner.nextInt();

        System.out.println("Por Favor digite o seu NOME");
        String nomeCliente = scanner.next();

        System.out.println("Por Favor digite o seu SALDO");
        double saldo =scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        " conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque");
    }
}
