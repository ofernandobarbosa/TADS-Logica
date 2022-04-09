
/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que
o usuário informe sua data de nascimento e o sistema irá calcular quantos
anos, meses e dias a pessoa viveu.
*/
import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idadeAno, idadeMes, idadeDia, diasVida;

        System.out.println("Digite sua idade em anos: ");
        idadeAno = input.nextInt();
        System.out.println("Digite sua idade em meses: ");
        idadeMes = input.nextInt();
        System.out.println("Digite sua idade em dias: ");
        idadeDia = input.nextInt();

        diasVida = idadeAno * 365 + idadeMes * 30 + idadeDia;

        System.out.printf("Você tem %d dias de vida\n", diasVida);
    }
}
