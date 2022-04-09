import java.util.Scanner;


/**
 * 9. Escreva um algoritmo que leia as notas das duas avaliações normais e a nota da
avaliação optativa. Caso o aluno não tenha feito a optativa deve ser fornecido o valor
–1. Calcular a média do semestre considerando que a prova optativa substitui a nota
mais baixa entre as duas primeiras avaliações. Escrever a média e mensagens que
indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as
informações abaixo:
Aprovado : media >= 6.0
Reprovado: media < 3.0
Exame : media >= 3.0 e < 6.0
 */
public class MediaAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float avaliacao1, avaliacao2, avaliacaoOptativa=-1, mediaSemestre;
        String status;

        System.out.print("Digite a nota da avaliação 1: ");
        avaliacao1 = input.nextFloat();
        System.out.print("Digite a nota da avaliação 2: ");
        avaliacao2 = input.nextFloat();
        System.out.print("Digite a nota da avaliação optativa ('-1' caso não tenha feito): ");
        avaliacaoOptativa = input.nextFloat();

        if (avaliacaoOptativa>=avaliacao1 && avaliacaoOptativa<=avaliacao2) {
            mediaSemestre = (avaliacaoOptativa +avaliacao2)/2;
        } else if (avaliacaoOptativa<=avaliacao1 && avaliacaoOptativa>=avaliacao2){
            mediaSemestre = (avaliacaoOptativa +avaliacao1)/2;
        }else{
            mediaSemestre = (avaliacao1+avaliacao2)/2;
        }

        if (mediaSemestre>=6) {
            status = "aprovado!";
        } else if(mediaSemestre >= 3 && mediaSemestre < 6){
            status = "em exame!";
        }else{
            status = "reprovado!";
        }
        

        System.out.printf("\nA média do aluno foi %s \nO aluno está %s \n", mediaSemestre, status);

    }
}
