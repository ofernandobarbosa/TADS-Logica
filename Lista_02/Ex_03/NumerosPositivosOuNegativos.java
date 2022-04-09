
/*
3. Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
positivo).
*/
import java.util.Scanner;

public class NumerosPositivosOuNegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String resp;

        System.out.print("Digite um número qualquer:");
        numero = input.nextInt();
        resp = "N";

        while (resp == "N") {
            if (numero > 0) {
                System.out.printf("O número %d é positivo!\n", numero);
            } else if (numero < 0) {
                System.out.printf("O número %d é negativo!\n", numero);
            } else {
                System.out.printf("O número %d é neutro!\n", numero);
            }
            System.out.print("Deseja continuar? ");
            resp = input.next();
        }
    }
}
