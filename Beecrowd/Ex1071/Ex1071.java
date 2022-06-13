import java.io.IOException;
import java.util.Scanner;

public class Ex1071 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int x, y, soma = 0;

        x = input.nextInt();
        y = input.nextInt();

        int menor, maior;
        if (x <= y) {
            menor = x;
            maior = y;
        } else {
            menor = y;
            maior = x;
        }
        menor++;
        while (menor < maior) {
            if (menor % 2 != 0) {
                soma += menor;
            }
            menor++;
        }
        System.out.println(soma);
    }
}