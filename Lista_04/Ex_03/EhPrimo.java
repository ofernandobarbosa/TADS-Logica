import java.util.Scanner;
// 3. Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado.

public class EhPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, divisor = 1, cont = 0;
        boolean ehVerdade = false;

        System.out.print("Digite um valor para descobrir se é um número primo: ");
        n = input.nextInt();

        while (divisor <= n) {
            if (n % divisor == 0) {
                cont++;
                if (cont == 2) {
                    ehVerdade = true;
                } else {
                    ehVerdade = false;
                }
            }
            divisor++;
        }
        if (ehVerdade == true) {
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }
    }
}
