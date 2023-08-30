import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int numeroAgencia = sc.nextInt();
        
        System.out.print("Por favor, digite a Agência: ");
        String agencia = sc.next();

        System.out.print("Nome do Cliente: ");
        String nomeCliente = sc.next();
        sc.nextLine();
        
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroAgencia, saldo);

        sc.close();

    }
}
