import java.util.Scanner;

public class numeroReal {
    public static void main(String[] args) {
        double number, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor Real: ");
        number = input.nextDouble();

        result = number * 1.2;
        System.out.printf("O resultado é -> %.2f\n", result);

        input.close();
    }
}
