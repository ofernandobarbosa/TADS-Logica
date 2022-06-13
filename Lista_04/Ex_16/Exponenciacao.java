import java.util.Scanner;
// 16. Receba um número inteiro positivo, e o seu respectivo expoente inteiro positivo, e
// apresente o resultado da potência deste número. Faça isso utilizando o comando
// while. Tenha cuidado com as inicializações!

public class Exponenciacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, expoente, cont = 0, total= 1;

        System.out.printf("Digite um número: ");
        numero = input.nextInt();
        System.out.printf("Digite o expoente: ");
        expoente = input.nextInt();
        while (cont < expoente) {
            total *= numero;
            cont++;
        }
        System.out.printf("O número %d elevado a %d é %d\n", numero, expoente, total);
    }
}
