import java.util.Scanner;
// Escreva um programa que apresente quatro opções: (a) consulta saldo, (b) saque e
// (c) depósito e (d) sair. O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o
// valor do saldo deve ser atualizado.

public class MiniBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float saldo = 0, saque, deposito;
        char opcao = ' ';

        System.out.println("Bem vindo ao seu Banco:");
        while (opcao != 'D') {
            System.out.println("\nA • Consulta Saldo");
            System.out.println("B • Saque");
            System.out.println("C • Depósito");
            System.out.println("D • Sair\n");
            System.out.print("Digite sua opcão: ");
            opcao = Character.toUpperCase(input.next().charAt(0));

            if (opcao == 'A') {
                System.out.printf("Seu saldo é de R$%.2f", saldo);
            } else if (opcao == 'B') {
                System.out.print("Digite o valor a ser sacado: R$");
                saque = input.nextFloat();
                saldo -= saque;
            } else if (opcao == 'C') {
                System.out.print("Qual valor deseja depositar? R$");
                deposito = input.nextFloat();
                saldo += deposito;
            }

        }

    }
}
