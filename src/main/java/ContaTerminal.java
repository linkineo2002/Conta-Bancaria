import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;


        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scan.next();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scan.next();

        System.out.println("Por favor, digite o número da Conta: ");
        numero = scan.nextInt();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scan.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
