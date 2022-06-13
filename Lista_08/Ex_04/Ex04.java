import java.util.Scanner;
// 4. Faça um programa que leia 10 valores do teclado, e que imprima esses valores
// divididos em 2 etapas: primeiro, somente os valores pares, e depois, somente os
// valores ímpares. Identifique cada valor escrevendo ao lado do valor se ele é par ou
// ímpar.

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] valores = new int[10];
        int valor;
        for (int i = 0; i < valores.length; i++) {
            valor = in.nextInt();
            valores[i] = valor;
        }
        System.out.println("Valores pares:");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.print(valores[i]+"\t");
            }
        }
        System.out.println();
        System.out.println("Valores impares:");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 != 0) {
                System.out.print(valores[i]+"\t");
            }
        }
        System.out.println();
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] % 2 == 0) {
                System.out.println(valores[i] + " na posição " + i + " é Par");
            } else {
                System.out.println(valores[i] + " na posição " + i + " é Impar");
            }

        }

    }
}
