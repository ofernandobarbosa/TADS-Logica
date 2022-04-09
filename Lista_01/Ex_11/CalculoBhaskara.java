
/*
Desafio 01 - Desenvolva um algoritmo para fazer o cálculo de Bhaskara. O algoritmo
deve considerar que o valor de delta calculado será sempre positivo. E deve pedir
para o usuário informar os valores a, b, c da equação de segundo grau. No fim, o
algoritmo deve mostrar os valores de x1 e x2 (xis linha e duas linhas). Considere
uma nova instrução raizq que calcula a raiz quadrada do número passado por
parâmetro (dentro dos parênteses). Exemplo: raizq(64) resulta em 8.
*/

import java.util.Scanner;

public class CalculoBhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, x1, x2, delta, result;
        String div;

        System.out.print("Digite o valor de a: ");
        a = input.nextInt();
        System.out.print("Digite o valor de b: ");
        b = input.nextInt();
        System.out.print("Digite o valor de c: ");
        c = input.nextInt();

        delta = (b * b) - (4 * a * c);
        x1 = (-1 * b) / (2 * a);
        x2 = (-1 * delta) / (4 * a);
        div = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";

        if (delta < 0) {
            System.out.println(div);
            System.out.println("● Não existem raizes reais para delta negativo!");
            System.out.println(div);
        } else if (delta == 0) {
            System.out.println(div);
            System.out.println("● O valor de delta é 0, então temos apenas uma raíz real!");
            System.out.println("● valor de X = " + x1);
            System.out.println(div);
        } else {
            System.out.println(div);
            System.out.println("● O valor de delta é maior que 0!");
            System.out.println("● valor de X' = " + x1);
            System.out.println("● valor de X'' = " + x2);
            System.out.println(div);
        }

    }
}
