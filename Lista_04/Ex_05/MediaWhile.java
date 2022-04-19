import java.util.Scanner;
// 5. Faça um programa que receba a 5 notas de um aluno, através do comando while, e
// que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma
// variável nota, e uma variável média.

public class MediaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota, media = 0;
        int cont = 0;
        while (cont < 5) {
            System.out.print("Informe uma nota:");
            nota = input.nextFloat();
            media += nota;
            cont++;
        }
        media /= 5;
        System.out.printf("A média do aluno é %.2f\n", media);
    }
}
