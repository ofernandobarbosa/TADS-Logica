
/*
 Desafio 02 - Até agora nossos algoritmos obedecem sequências simples de passos.
Vamos supor que eu tenha mais de uma opção, por exemplo, um aluno pode ser
aprovado ou ficar de recuperação em determinada disciplina, isso significa que
vamos ter duas possíveis respostas de acordo com a nota deste aluno.
// A NOTA INFORMADA PODE SER MAIOR OU IGUAL A 7 (SETE), ENTÃO O
ALUNO SERÁ APROVADO, CASO CONTRÁRIO O ALUNO PRECISARÁ FAZER
RECUPERAÇÃO.
// Como podemos representar este comportamento em nosso algoritmo?
*/

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nota1, nota2, media;
        String div;
        div = "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";

        System.out.println(div);
        nota1 = -1;
        while (nota1 < 0) {
            System.out.print("Digite a nota 1: ");
            nota1 = input.nextFloat();
        }
        nota2 = -1;
        while (nota2 < 0) {
            System.out.print("Digite a nota 2: ");
            nota2 = input.nextFloat();
        }

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println(div);
            System.out.println("Parabéns, você foi aprovad@!!! \nSua média é " + media);
            System.out.println(div);
        } else {
            System.out.println(div);
            System.out.println("Poxa que pena, infelizmente você está em recuperação! ;( \nSua média é " + media);
            System.out.println(div);
        }

    }
}
