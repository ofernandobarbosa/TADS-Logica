import java.util.Scanner;

//23. Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em
//estoque e quantidade mínima em estoque de um produto. Calcular e escrever a
//quantidade média, usando a seguinte fórmula: ((quantidade média = quantidade
//máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
//quantidade média escrever a mensagem “Não efetuar compra”, senão escrever a
//mensagem “Efetuar compra”.

public class Estoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qteAtual, qteMax, qteMin;
        float media;

        System.out.print("Digite a quantidade máxima: ");
        qteMax = input.nextInt();
        System.out.print("Digite a quantidade mínima: ");
        qteMin = input.nextInt();
        System.out.print("Digite a quantidade atual: ");
        qteAtual = input.nextInt();

        media = (qteMax + qteMin) / 2;

        if (qteAtual >= media) {
            System.out.print("“Não efetuar compra”");
        } else {
            System.out.print("“Efetuar a compra”");
        }

    }
}