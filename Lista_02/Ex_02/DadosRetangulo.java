
/*
2. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
calcular e escrever a área e o perímetro do retângulo.

*/
import java.util.Scanner;

public class DadosRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, altura, area, perimetro;

        System.out.print("Digite o valor base do retângulo: ");
        base = input.nextInt();
        System.out.print("Digite o valor altura do retângulo: ");
        altura = input.nextInt();

        area = base * altura;
        perimetro = (base * 2) + (altura * 2);

        System.out.println("-=-=-=-=- Dados do retângulo -=-=-=-=-");
        System.out.println("⇨ A área do retangulo é " + area);
        System.out.println("⇨ O perímetro do retangulo é " + perimetro);
    }
}
