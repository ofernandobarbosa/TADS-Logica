/*
===== Comando =====
Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir quadrado do número informado pelo
usuário.
*/
import java.util.Scanner;

public class quadradoNumero {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double number, result;
        
        System.out.println("Digite um valor inteiro: ");
        number = input.nextDouble();
        result = number * number;

        System.out.printf("O quadrado do número %.0f é %.0f \n", number, result);

        input.close();        
    }
}
