import java.util.Scanner;

// 7. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
// (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
// pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4.30 e o preço do
// litro do álcool é R$ 3.90.
public class Posto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorTotal = 0, qteCombustivel;
        String tipoCombustivel;
        final float precoAlcool = 3.9f, precoGasol = 4.3f;


        System.out.print("Qual o tipo de combustível (A - álcool / G - gasolina)? ");
        tipoCombustivel = input.next().toUpperCase();
        System.out.print("Quantos litros foram abastecidos? ");
        qteCombustivel = input.nextFloat();

        // if (tipoCombustivel.equals("A") && qteCombustivel < 20) {
        //     valorTotal = qteCombustivel * precoAlcool * 0.97f;
        // } else if (tipoCombustivel.equals("A") && qteCombustivel >= 20) {
        //     valorTotal = qteCombustivel * precoAlcool * 0.95f;
        // } else if (tipoCombustivel.equals("G") && qteCombustivel < 20) {
        //     valorTotal = qteCombustivel * precoGasol * 0.96f;
        // } else if (tipoCombustivel.equals("G") && qteCombustivel >= 20) {
        //     valorTotal = qteCombustivel * precoGasol * 0.94f;
        // } else {
        //     System.out.println("Digite um valor aceitavel.");
        // }

        if(tipoCombustivel.equals("A")){
            if(qteCombustivel<20){
                desconto = 0.97f;
            }else{
                desconto = 0.95f;
            }
            valorTotal = qteCombustivel * precoAlcool * desconto;
        }else if(tipoCombustivel.equals("G")){
            if(qteCombustivel<20){
                desconto = 0.96f;
            }else{
                desconto = 0.94f;
            }
            valorTotal = qteCombustivel * precoGasol * desconto;
        }
       System.out.printf("O valor total do combustível foi de R$%.2f\n", valorTotal);
    }
}
