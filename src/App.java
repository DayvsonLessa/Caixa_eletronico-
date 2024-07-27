import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao Banco Less");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do titular");
        var nome = leitor.nextLine();

        System.out.println("Digite o CPF do titular");
        var número = leitor.nextDouble();

        System.out.println(" Digite o valor de saque!");
        var valor = leitor.nextDouble();

        int saldo = 100;

        if (valor > 1000){
            System.out.println("Olá " +nome + "! O saque de " +valor +" não pode ser realizado: valor máximo para saque é de R$1.000,00" );
        } else if (valor < 10){
            System.out.println("Olá " +nome + "! O saque de " +valor +" não pode ser realizado: valor minimo para saque é de R$10,00" );
        } else if (valor % 10 != 0){
            //resto da divisao diferente de zero
            System.out.println("Olá " +nome + "! O saque de " +valor +" não pode ser realizado: Cédulas disponives R$10, R$20, R$50 e R$100" );

        } else if (valor > saldo){
            System.out.println("Olá " +nome + "! O saque de " +valor +" não pode ser realizado: Saldo insuficiente! Saldo atual: " +saldo);
        } else {
            System.out.println("Olá " + nome + "! O saque de " + valor + " foi realizado com sucesso!!");
        }





    }

}

