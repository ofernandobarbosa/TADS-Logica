// 11. Escreva um algoritmo para ler o número de lados de um polígono regular e a medida
// do lado (em cm). Calcular e imprimir o seguinte:
// - Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu
// perímetro.
// - Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
// - Se o número de lados for igual a 5 escrever PENTÁGONO.
// Observação: Considere que o usuário só informará os valores 3, 4 ou 5.

import java.util.Scanner;

public class PoligonoRegular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lados = -1, perimetro = 0, comprimento;
        String tipo = "";

        System.out.print("Quantos lados tem o seu polígono? ");
        lados = input.nextInt();

        if (lados == 3 || lados == 4 || lados == 5) {
            System.out.print("Qual o comprimento de um dos lados? ");
            comprimento = input.nextInt();

            if (lados == 3) {
                tipo = "TRIÂNGULO!";
            } else if (lados == 4) {
                tipo = "QUADRADO!";
            } else if (lados == 5) {
                tipo = "PENTÁGONO!";
            }
            perimetro = lados * comprimento;
            System.out.println("O polígono é um " + tipo);
            System.out.println("Seu perímetro é de " + perimetro);
        } else {
            System.out.println("Digite um valor válido!");
        }
    }
}
