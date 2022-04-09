
/*
4. Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
deles é o maior, imprimindo na resposta o nome da variável e o seu valor.

*/
import java.util.Scanner;

public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite o primeiro número: ");
        numero1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.printf("O numero 1 = %d é maior que o numero 2 = %d", numero1, numero2);
        } else if (numero1 < numero2) {
            System.out.printf("O numero 2 = %d é maior que o numero 1 = %d", numero2, numero1);
        } else {
            System.out.printf("O numero 1 = %d é igual ao numero 2 = %d", numero1, numero2);
        }

    }
}
