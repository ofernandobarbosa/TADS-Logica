// 19. Escreva um algoritmo para ler as dimensões de uma cozinha retangular
// (comprimento, largura e altura), calcular e escrever a quantidade de caixas de
// azulejos para se colocar em todas as suas paredes (considere que não será
// descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1.5
// m2 .
import java.util.InputMismatchException;
import java.util.Scanner;

public class CaixaAzulejo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float comprimento, largura, altura, qteCaixas, areaTotal;

        //Entrada
        System.out.print("Digite o comprimento da cozinha: ");
        comprimento = input.nextFloat();
        System.out.print("Digite a largura da cozinha: ");
        largura = input.nextFloat();
        System.out.print("Digite a altura da cozinha: ");
        altura = input.nextFloat();
        
        //Processamento
        areaTotal = (comprimento*altura)+(largura*altura);
        qteCaixas = areaTotal/1.5f;

        //Saida
        System.out.printf("O número de caixas de azulejo para toda cozinha é de → %.0f\n", qteCaixas);

    }
}
