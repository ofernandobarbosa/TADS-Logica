import java.util.Scanner;

// Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
// média da viagem, informe o tempo que uma família levará saindo de sua cidade de
// férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
// calculado.

public class tempoViagem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double distancia, velocidadeMedia, tempo, minuto;

        System.out.print("Digite a distância a ser percorrida em Km: ");
        distancia = input.nextDouble();
        System.out.print("Digite a velocidade média da viagem em Km/h: ");
        velocidadeMedia = input.nextDouble();
        tempo = distancia/velocidadeMedia;
        minuto = (tempo - (int)tempo)*60;

        System.out.printf("O tempo de viagem é %.0f hora(s) e %.0f minutos\n", tempo, minuto);
        

    }
}
