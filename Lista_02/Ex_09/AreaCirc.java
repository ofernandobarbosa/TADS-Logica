
/*
9. Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692
*/
import java.util.Scanner;

public class AreaCirc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float raio, diametro, comprimento, area, PI;
        PI = 3.141692f;

        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
        System.out.println("Digite o raio da circunferência: ");
        raio = input.nextFloat();

        diametro = 2 * raio;
        comprimento = 2 * PI * raio;
        area = PI * raio * raio;

        System.out.println("● O diâmetro da circunferência é " + diametro);
        System.out.println("● O comprimento da circunferência é " + comprimento);
        System.out.println("● A área da circunferência é " + area);
        System.out.println("●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●●");
    }
}
