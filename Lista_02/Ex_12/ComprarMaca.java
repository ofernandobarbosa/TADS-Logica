
// 12. As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
// 1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
// de maçãs compradas, calcule e escreva o custo total da compra.
import java.util.Scanner;

public class ComprarMaca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroMacas;
        float valorTotal;

        System.out.print("Digite o número de maçãs: ");
        numeroMacas = input.nextInt();

        if (numeroMacas < 12) {
            valorTotal = numeroMacas * 1.5f;
            System.out.println("O valor total das maçãs é R$" + valorTotal);
        } else if (numeroMacas >= 12) {
            valorTotal = numeroMacas * 1.3f;
            System.out.println("O valor total das maçãs é R$" + valorTotal);
        }
    }
}
