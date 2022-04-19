import java.util.Scanner;
// Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor
// lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após
// a leitura do valor, escrever o valor lido na tela.
public class LerValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valor=0;

        while (valor <1 || valor>10) {
            System.out.println("Digite um número entre 1 e 10.");
            valor = input.nextFloat();
        }
        if (valor>=1 && valor <=10) System.out.printf("O número %.0f está no intervalo!\n",valor);
    }
}
