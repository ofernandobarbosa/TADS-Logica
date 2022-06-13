// Desenvolva o algoritmo de um programa para calcular a média de duas notas das
// avaliações de um aluno.
import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Digite a nota 1: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a nota 2: ");
        nota2 = input.nextDouble();
        media = (nota1 + nota2)/2;

        if (media>=6) {
            System.out.println("Aluno APROVADO! A média do aluno é: " + media);
        } else {
            System.out.println("Aluno REPROVADO! A média do aluno é: " + media);
        }
    }
}
