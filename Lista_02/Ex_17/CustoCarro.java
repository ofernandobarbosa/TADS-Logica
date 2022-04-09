import java.util.Scanner;

// 17. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
// porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).

// Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
// escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
// custo final ao consumidor.

public class CustoCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float custoFabrica, custoFinal, percentFornecedor, percentImposto;
        percentFornecedor = 1.28f;
        percentImposto = 1.45f;

        System.out.print("Qual o custo de fábrica do veículo? ");
        custoFabrica = input.nextFloat();
        custoFinal = (custoFabrica*percentImposto)*percentFornecedor;
        
        System.out.println("O custo final do veículo é R$"+custoFinal);
        
    }
}
