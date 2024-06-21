import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // double saldo = scanner.nextDouble();
        System.out.println("Qual é o número da sua agência com dígito, exemplo: 111-1");
        String agencia = scanner.next();

        System.out.println("Qual é o seu Nome?");
        String nomeCliente = scanner.next();
        
       

        System.out.println("Qual é o número da sua conta bancária?");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Qual é o seu saldo?");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta " + numeroConta+ " e seu saldo é" +saldo+ ", o mesmo já está disponível para saque");

    }
}
