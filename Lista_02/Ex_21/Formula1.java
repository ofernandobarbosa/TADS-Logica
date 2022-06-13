import java.util.Scanner;

// 21. A equipe Red Bull Racing de Fórmula 1 deseja calcular o "número mínimo de litros"
// que deverá colocar no tanque de seu carro para que ele possa percorrer um
// determinado número de voltas "até o primeiro reabastecimento". Escreva um
// algoritmo que leia o "comprimento da pista (em metros)", "o número total de voltas" a
// serem percorridas no grande prêmio, o "número de reabastecimentos desejados" e o
// "consumo de combustível do carro" (em Km/L). Calcular e escrever o número mínimo
// de litros necessários para percorrer até o primeiro reabastecimento. Observação:
// Considere que o número de voltas entre os reabastecimentos é o mesmo.

public class Formula1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int comprimentoPista, numeroTotalVoltas, ReabastecimentosDesejados, distanciaTotalPercorrida;
        float consumoCarro, consumoAtePrimeiroAbastecimento;

        comprimentoPista = input.nextInt();
        numeroTotalVoltas = input.nextInt();
        ReabastecimentosDesejados = input.nextInt();
        consumoCarro = input.nextInt();

        distanciaTotalPercorridaKm = comprimentoPista*numeroTotalVoltas/1000;
        consumoMinimo = distanciaTotalPercorrida/consumoCarro;

    }
}