import java.util.Scanner;
import java.util.TooManyListenersException;

// Considere que você deseja uma comemoração especial para o seu aniversário e
// assim irá convidar familiares a amigos para um churrasco na sua residência. Você
// irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
// de uma forma de calcular a quantidade certa a ser adquirida.
// Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
// bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
// consomem uma quantidades diferentes de carne.
// Consumo de carne médio
// (http://www.embaixadordochurrasco.com.br/calculochurrasco):
// Homens: 400 gramas
// Mulheres: 320 gramas
// Crianças: 200 gramas
// *Observação: geralmente é adicionada uma margem de segurança na quantidade
// de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
// de 20% no total de carne a ser adquirida.

public class CalculoChurrasco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroMulheres, numeroHomens, numeroCriancas;
        double consumoMulhers, consumoHomens, consumoCriancas, totalCarne;

        System.out.println("Digite a quantidade de pessoas: ");
        System.out.print("Mulheres: ");
        numeroMulheres = input.nextInt();
        System.out.print("Homens: ");
        numeroHomens = input.nextInt();
        System.out.print("Crianças: ");
        numeroCriancas = input.nextInt();
        
        consumoMulhers = numeroMulheres * 320;
        consumoHomens = numeroHomens * 400;
        consumoCriancas = numeroCriancas * 200;

        totalCarne = ((consumoMulhers+consumoHomens+consumoCriancas)*1.2)/1000;

        System.out.printf("O total de carne a ser adquirido é de %.2f Kg\n", totalCarne);

    }
}
