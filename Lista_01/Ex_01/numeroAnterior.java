// Exercício 1 - Lista exercício 01
import java.util.Scanner;

public class numeroAnterior {
    public static void main(String[] args) {
        int numeroInteiro, numeroAnterior;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        numeroInteiro = in.nextInt();
        numeroAnterior = numeroInteiro - 1;

        System.out.println("O número anterior é: " + numeroAnterior);

        in.close();

    }
}
