import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        
        //int numero =1021;
        //String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48; 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agencia");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o numero da conta");
        int numero = scanner.nextInt();
        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia + " conta  " + numero + " e seu saldo " + saldo +" já está disponivel para saque");
        scanner.close();

    }   

}
