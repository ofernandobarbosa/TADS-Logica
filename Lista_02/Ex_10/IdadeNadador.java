
/*
10. Faça um programa que receba a idade de um nadador e classifique-o numa das
seguintes categorias:
• Adulto (idade >= 18);
• Juvenil (idade >= 14 e idade < 18);
• Infantil (idade >=9 e idade < 14);
• Mirim (Idade < 9).

*/
import java.util.Scanner;

public class IdadeNadador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
        System.out.println("Digite a idade do nadador: ");
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("• Nadador categoria Adulto.");
        } else if (idade >= 14 && idade < 18) {
            System.out.println("• Nadador categoria Juvenil.");
        } else if (idade >= 9 && idade < 14) {
            System.out.println("• Nadador categoria Infantil.");
        } else if (idade < 9 && idade > 0) {
            System.out.println("• Nadador categoria Mirim.");
        } else {
            System.out.println("- Digite um valor válido!!!!");
        }
    }
}
