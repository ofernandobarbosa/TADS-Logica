import java.util.Scanner;

import javax.swing.JSpinner.DefaultEditor;

//25. Faça um programa que leia o valor de um produto X e leia a quantidade de reais de
//um cofrinho que contenha:
//♦ N moedas de 1 real;
//♦ N moedas de 50 centavos;
//♦ N moedas de 25 centavos;
//♦ N moedas de 10 centavos;
//♦ N moedas de 5 centavos;
//O programa deverá verificar se o total de reais que contém no cofrinho é o bastante
//para a compra o produto X.

public class Cofre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorProduto, valorNoCofre, real, cinquentaCents, vinteEcincoCents, dezCents, cincoCents, centavos,
                restoCofre;

        System.out.println("Qual o valor do produto? ");
        valorProduto = input.nextFloat();
        System.out.println("Quantas moedas de 1 Real tem no cofre? ");
        real = input.nextFloat();
        System.out.println("Quantas moedas de 50 centavos tem no cofre? ");
        cinquentaCents = input.nextFloat();
        System.out.println("Quantas moedas de 25 centavos tem no cofre? ");
        vinteEcincoCents = input.nextFloat();
        System.out.println("Quantas moedas de 10 centavos tem no cofre? ");
        dezCents = input.nextFloat();
        System.out.println("Quantas moedas de 5 centavos tem no cofre? ");
        cincoCents = input.nextFloat();

        cinquentaCents *= 0.5;
        vinteEcincoCents *= 0.25;
        dezCents *= 0.1;
        cincoCents *= 0.05;

        centavos = cinquentaCents + vinteEcincoCents + dezCents + cincoCents;
        valorNoCofre = centavos + real;
        restoCofre = valorNoCofre - valorProduto;

        if (valorNoCofre >= valorProduto) {
            System.out.println("O valor no cofre é suficiente para comprar o produto! Ainda sobram R$" + restoCofre);
        } else {
            System.out.println("Infelizmente o valor no cofre não é suficiente para comprar o produto! :(\nFaltam R$"
                    + restoCofre);
        }

    }
}
