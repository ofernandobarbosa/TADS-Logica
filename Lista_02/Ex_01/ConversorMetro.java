
/*
Faça um algoritmo que converta metros para centímetros. Lembrando que 1m =
100cm
*/
import java.util.Scanner;

public class ConversorMetro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float metro, centi;
        System.out.println(">>>>>>>>>> Conversor de metro -> centimetro <<<<<<<<<<<");
        System.out.print("Digite a medida em metros: ");

        metro = input.nextFloat();
        centi = metro * 100;

        System.out.printf("A medida convertida em centimetros é %.0fcm", centi);

    }
}
