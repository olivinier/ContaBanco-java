
import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) throws Exception {
        System.out.println("digite o número da sua agência : ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println("digite a sua agência :");
        String agencia = scanner.next();
        System.out.println("digite seu nome : ");
        String nome = scanner.next();
        System.out.println("digite seu saldo :");
        double saldo = scanner.nextByte();
        System.out.println("olá, " + nome + "obrigado por criar uma conta em nosso banco. Sua agência é : " + agencia + " conta " + numero + "e seu saldo de " + saldo + "já está disponível."); 



    }
}