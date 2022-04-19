import java.util.Scanner;

// 11. Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO,
// deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o
// valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor
// lido pelo segundo valor lido.
public class Divisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valor1, valor2=0, divisao;

        System.out.print("Informe o primeiro valor: ");
        valor1 = input.nextFloat();
        while (valor2 == 0){
            System.out.print("Digite o segundo valor: ");
            valor2 = input.nextFloat();
            if (valor2==0){
                System.out.println("Digite um valor válido para o divisor.");
            }else{
                divisao = valor1/valor2;
                System.out.printf("O resuldado da divisão entre %.0f e %.0f é %.2f\n", valor1, valor2, divisao);
            }
        }
        
    }
}
