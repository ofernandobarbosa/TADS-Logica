import java.util.Scanner;

// 3. Faça um programa onde você declara um vetor de 10 posições que receba
// respectivamente 10 valores do tipo float (você deverá digitá-los via teclado).
// Apresente então, a média desses 10 valores.

public class Media {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] valores = new float[10];
        float media = 0, valor;

        for (int i = 0; i < valores.length; i++) {
            valor = in.nextInt();
            valores[i] = valor;
            media += valores[i];
        }
        media /= valores.length;
        System.out.println(media);
    }
}
