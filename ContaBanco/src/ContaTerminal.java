import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu saldo !");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola "+ nome + ", Obrigado por criar uma conta em nosso banco ");
        System.out.println("Sua Agência é " + agencia +", conta "+conta +"");
        System.out.println("E seu saldo é "+saldo+ " e ja está disponivel para saque.");
       

    }
}
