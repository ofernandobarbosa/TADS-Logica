// 14. Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
// que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
// em que a pessoa nasceu).

import java.util.Scanner;

public class ValidaVoto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anoNascimento, anoAtual, idade;

        System.out.print("Qual ano você nasceu? ");
        anoNascimento = input.nextInt();
        System.out.print("Em que ano estamos? ");
        anoAtual = input.nextInt();
        idade = anoAtual - anoNascimento;

        if (idade > 16) {
            System.out.printf("Você tem %d anos, você pode votar esse ano!\n", idade);
        }else if(idade < 16){
            System.out.printf("Você tem %d anos, você NÃO pode votar esse ano!\nFalta(m) %d ano(s) para você votar!\n", idade, 16 - idade);
        }



    }
}
