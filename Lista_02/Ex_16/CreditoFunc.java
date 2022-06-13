// 16. Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
// não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
// valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
// concedido. Nenhum dos valores informados pode ser zero ou negativo.

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class CreditoFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidadePrestacoes;
        float salario, emprestimo, valorPrestacoes;

        System.out.print("Digite seu salário: R$");
        salario = input.nextFloat();
        System.out.printf("Digite o valor do empréstimo desejado: R$");
        emprestimo = input.nextFloat();
        System.out.print("Em quantas parcelas deseja pagar? ");
        quantidadePrestacoes = input.nextInt();

        valorPrestacoes = emprestimo / quantidadePrestacoes;

        if (quantidadePrestacoes <= 0 || salario <= 0 || emprestimo <= 0) {
            System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.println("Nenhum dos valores informados pode ser zero ou negativo.");
        } else if (valorPrestacoes > salario * 0.3) {
            System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.println("Empréstimo NÃO aprovado!\nO as prestações excederam os 30% do seu salário!");
        } else {
            System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.printf("Parabéns seu empréstimo foi APROVADO!\n• Valor das parcelas: %.2f em %dX\n",
                    valorPrestacoes, quantidadePrestacoes);
        }

    }
}
