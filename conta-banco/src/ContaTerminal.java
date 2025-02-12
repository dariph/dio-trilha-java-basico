import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {        
        //int numero =1021;
        //String agencia = "067-8";

        String nomeCliente = "Mario Andrade";
        double saldo = 237.48; 
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da agencia: ");
        String agencia = scanner.nextLine();

        
        System.out.print("Por favor, digite o numero da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("---------------------------------");
        System.out.println("Ola "+ nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia + " conta  " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");
        System.out.println("---------------------------------");
        
        scanner.close();
    } 
}
