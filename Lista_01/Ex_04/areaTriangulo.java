/*
==== COMANDO ====
Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
triângulo.

*/
import java.util.Scanner;

public class areaTriangulo {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Digite a base do triângulo: ");
        base = input.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        altura = input.nextDouble();
        area = base*altura/2;

        System.out.println("A área do Triângulo é " + area);
    }
}
