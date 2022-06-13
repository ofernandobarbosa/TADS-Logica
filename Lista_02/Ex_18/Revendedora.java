import java.util.Scanner;

// 18. Uma revendedora de carros usados paga a seus funcionários vendedores um salário
// fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
// do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
// carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
// recebe por carro vendido. Calcule e escreva o salário final do vendedor.

public class Revendedora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salarioFixo, comissaoPorCarro, comissaoVendaTotal, valorTotalVendas, salarioFinal;
        int carrosVendidos;
        
        System.out.print("• Quantos carros foram vendidos? ");
        carrosVendidos = input.nextInt();
        System.out.print("• Qual a comissão por carro vendido? ");
        comissaoPorCarro = input.nextFloat();
        System.out.print("• Qual o valor total das vendas? ");
        valorTotalVendas = input.nextFloat();
        System.out.print("• Qual o salário fixo? ");
        salarioFixo = input.nextFloat();

        comissaoVendaTotal = valorTotalVendas * 0.05f;
        salarioFinal = salarioFixo + comissaoPorCarro*carrosVendidos + comissaoVendaTotal;

        System.out.println(" • O salário final do vendedor é: R$"+ salarioFinal);
    }
}
