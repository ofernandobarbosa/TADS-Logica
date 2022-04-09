import java.util.Scanner;

//24. Escreva um programa que faça a leitura da idade de 2 homens e 2 mulheres
//(supondo que as idades do mesmo sexo serão diferentes). O programa deve fazer o
//somatório da idade do homem mais velho com a idade da mulher mais nova e o
//produto da idade do homem mais novo pela idade da mulher mais velha. Ao final
//você deve imprimir os resultados, e cada uma das idades digitadas: mulher mais
//nova, mulher mais velha, homem mais novo e homem mais velho.

public class Idades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int homem1, homem2, mulher1, mulher2;
        int somaHM, produtoHM, homemVelho, homemNovo, mulherVelha, mulherNova;

        System.out.println("Digite a idade do primeiro homem: ");
        homem1 = input.nextInt();
        System.out.println("Digite a idade do segundo homem: ");
        homem2 = input.nextInt();
        System.out.println("Digite a idade da primeira mulher: ");
        mulher1 = input.nextInt();
        System.out.println("Digite a idade da segunda mulher: ");
        mulher2 = input.nextInt();

        if (homem1 > homem2) {
            homemVelho = homem1;
            homemNovo = homem2;
        } else {
            homemNovo = homem1;
            homemVelho = homem2;
        }
        if (mulher1 > mulher2) {
            mulherVelha = mulher1;
            mulherNova = mulher2;
        } else {
            mulherNova = mulher1;
            mulherVelha = mulher2;
        }

        somaHM = homemVelho + mulherNova;
        produtoHM = homemNovo * mulherVelha;

        System.out.println("● A idade do homem mais velho é: " + homemVelho);
        System.out.println("● A idade do homem mais novo é: " + homemNovo);
        System.out.println("● A idade da mulher mais velha é: " + mulherVelha);
        System.out.println("● A idade da mulher mais nova é: " + mulherNova);
        System.out.println("● A soma entre o homem mais velho e a mulher mais nova é: " + somaHM);
        System.out.println("● O produto entre o homem mais novo e a mulher mais velha é: " + produtoHM);

    }
}
