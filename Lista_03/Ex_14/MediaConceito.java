import java.util.Scanner;

/* 
14. Faça um programa que receba os valores de 3 notas de um aluno e apresenta um
conceito baseado na tabela abaixo:

x >= 9           -> A
x >= 7.5 E < 9   -> B
x >= 6   E < 7.5 -> C
x < 6            -> D
*/
public class MediaConceito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        char conceito;

        System.out.print("Digite a nota 1: ");
        nota1 = input.nextFloat();
        System.out.print("Digite a nota 2: ");
        nota2 = input.nextFloat();
        System.out.print("Digite a nota 3: ");
        nota3 = input.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 9) {
            conceito = 'A';
        } else if (media >= 7.5 && media < 9) {
            conceito = 'B';
        } else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }

        System.out.printf("A média final é %.2f e a nota conceito é %c\n", media, conceito);

    }
}
