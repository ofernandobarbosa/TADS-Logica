
/*
11. Faça um programa que receba dois números e efetua a adição. Caso o valor
somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se
10.
*/
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, result;

        System.out.println("Digite o numero 1: ");
        numero1 = input.nextInt();
        System.out.println("Digite o numero 2: ");
        numero2 = input.nextInt();
        result = numero1 + numero2;

        if (result > 20) {
            result += 8;
        } else if (result <= 20) {
            result -= 10;
        }

        System.out.println("O resultado é " + result);
    }
}
