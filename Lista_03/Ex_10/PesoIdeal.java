
/** 10. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
2:masculino) de uma pessoa, construa um algoritmo que calcule e imprima seu peso
ideal, utilizando as seguintes fórmulas:
- para homens : (72.7 * h) – 58
- para mulheres : (62.1 * h) – 44.7
Observação: Altura = h (na fórmula acima).
*/
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float altura, pesoIdeal=-1;
        int sexo;

        System.out.print("Digite sua altura: ");
        altura = input.nextFloat();
        System.out.println("Qual o seu sexo?\n1 - Feminino\n2 - Masculino");
        sexo = input.nextInt();

        if (sexo == 1) {
            pesoIdeal = (72.7f * altura) - 58f;
        } else if (sexo == 2) {
            pesoIdeal = (62.1f * altura) - 44.7f;
        } else {
            System.out.println("Digite um valor real.");
        }

        System.out.printf("O peso ideal para você é: %.2f\n", pesoIdeal);

    }
}
