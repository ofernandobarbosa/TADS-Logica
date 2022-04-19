import java.util.Scanner;

// 1. Ler um número inteiro n. Escrever a soma de todos os números de 
// 1 até n.
public class Ex_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0, cont = 0;

        n = input.nextInt();
        while (cont<n) {
            cont++;
            total += cont;
            System.out.println(total);
        }

    }
}
