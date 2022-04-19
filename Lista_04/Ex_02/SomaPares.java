import java.util.Scanner;

// 2. Ler um número inteiro n. Escrever a soma de todos os números 
// pares de 2 até n.
public class SomaPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0, cont = 2;

        System.out.print("Qual o ultimo valor?");
        n = input.nextInt();

        if (cont > n) {
            System.out.println("Digite um valor inteiro maior que 2!");
        } else {
            while (cont <= n) {
                if (cont % 2 == 0) {
                    total += cont;
                }
                cont++;
            }
            System.out.println(total);
        }
    }
}
