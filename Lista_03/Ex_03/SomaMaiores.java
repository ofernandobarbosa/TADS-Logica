import java.util.Scanner;

// 3. Ler três valores (considere que não serão informados valores iguais) e escrever a
// soma dos dois maiores.
public class SomaMaiores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, valor3, soma=0;

        System.out.print("Digite o primeiro valor: ");
        valor1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = input.nextInt();

        if (valor1 < valor2 && valor1 < valor3) {
            soma = valor2 + valor3;
        } else if (valor2 < valor1 && valor2 < valor3) {
            soma = valor1 + valor3;
        } else if (valor3 < valor1 && valor3 < valor2) {
            soma = valor1 + valor2;
        }
        System.out.println("A soma dos dois maiores valores é " + soma);
    }
}
