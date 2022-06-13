import java.util.Scanner;

// 15. Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
// inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
// tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um
// dia e terminar no dia seguinte

public class TempoXadrex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaInicio, horaFim, tempoJogo;

        System.out.printf("Digite a hora de início do jogo: ");
        horaInicio = input.nextInt();
        System.out.printf("Digite a hora de término do jogo: ");
        horaFim = input.nextInt();
        tempoJogo =horaFim - horaInicio;


        if(tempoJogo<24 && tempoJogo>0){
            System.out.printf("O tempo de jogo foi de %d horas!\n", tempoJogo);
        } else if (tempoJogo==0) {
            System.out.println("O tempo de jogo foi de 24 horas!");
        }
      }
}
