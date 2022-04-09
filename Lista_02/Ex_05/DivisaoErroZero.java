
/*
5. Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
mensagem de erro.
*/
import java.util.Scanner;

public class DivisaoErroZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float numerador, denominador, resultado;

        System.out.print("Digite um numerador: ");
        numerador = input.nextFloat();
        System.out.print("Digite um denominador: ");
        denominador = input.nextFloat();

        if (denominador != 0) {
            resultado = numerador / denominador;
            System.out.print("O resultado da divisão é: " + resultado);
        } else {
            System.out.print("Cálculo não executado. O denominador deve ser diferente de ZERO.");
        }
    }
}
