import java.util.Scanner;

// 20. Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
// Sabendo-se que o preço do combustível é de R$ 4.599, escreva um algoritmo para
// ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia,
// o número de litros de combustível gasto e o valor total (R$) recebido dos
// passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
// do dia.
public class RendimentoTaxi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float precoCombustivel, odometroInicio, odometroFinal, kmRodado, combustivelGasto, custoCombustivel, valorTotal, media, lucro;
        precoCombustivel = 4.599f;

        //Entrada
        System.out.print("Digite o odômetro inicial → ");
        odometroInicio = input.nextFloat();
        System.out.print("Digite o odômetro final → ");
        odometroFinal = input.nextFloat();
        System.out.print("Digite a quantidade em litros de combustível gasto → ");
        combustivelGasto = input.nextFloat();
        System.out.print("Qual o valor total recebido dos passageiros → ");
        valorTotal = input.nextFloat();

        //Processamento
        kmRodado = odometroFinal - odometroInicio;
        media = kmRodado/combustivelGasto;
        custoCombustivel = combustivelGasto*precoCombustivel;
        lucro = valorTotal - custoCombustivel;

        //Saída
        
        System.out.printf("• A média de consumo do taxi é de → %.2fKm/L\n",media);
        System.out.printf("• O lucro total do táxi é de → R$%.2f\n",lucro);

    }
}
