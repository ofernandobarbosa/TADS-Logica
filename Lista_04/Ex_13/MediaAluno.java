import java.util.Scanner;
// 13. Faça um programa que receba 3 notas de um aluno, e escolha apenas as duas
// maiores notas para o cálculo da média. Apresente a média final, entre as duas
// maiores notas. Dica: utilize 3 comandos if.

public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, somaMaiores = 0, media;

        nota1 = input.nextFloat();
        nota2 = input.nextFloat();
        nota3 = input.nextFloat();

        // if (nota1 > nota2 && nota2 > nota3) {
        // maior1 = nota1;
        // maior2 = nota2;
        // } else if (nota1 > nota3 && nota3 > nota2) {
        // maior1 = nota1;
        // maior2 = nota3;
        // } else if (nota2 > nota1 && nota1 > nota3) {
        // maior1 = nota2;
        // maior2 = nota1;
        // } else if (nota2 > nota3 && nota3 > nota1) {
        // maior1 = nota2;
        // maior2 = nota3;
        // } else if (nota3 > nota1 && nota1 > nota2) {
        // maior1 = nota3;
        // maior2 = nota1;
        // } else if (nota3 > nota2 && nota2 > nota1) {
        // maior1 = nota3;
        // maior2 = nota2;
        // }

        if (nota1 < nota2 && nota1 < nota3) {
            somaMaiores = nota2 + nota3;
        } else if (nota2 < nota1 && nota2 < nota3) {
            somaMaiores = nota1 + nota3;
        } else if (nota3 < nota1 && nota3 < nota2){
            somaMaiores = nota1 + nota2;
        }

            media = somaMaiores / 2;

        System.out.println(media);

    }
}
