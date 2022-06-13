import java.util.Scanner;

/*
5. Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
graus Celsius.
A fórmula para conversão é a seguinte:

    C/5 = (F-32)/9

    F = (9*C/5) - 32 

Onde:
C = temperatura em graus Celsius;
F = temperatura em graus Fahrenheit.
*/

public class temperatureConversor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temperaturaF = 0, temperaturaC = 0, opcao = 0;
        String de = "", para = "";

        while (opcao != 3f) {
            System.out.println("Conversor de temperatura:");
            System.out.println("1 : Celcius -> Fahrenheit\n2 : Fahrenheit -> Celcius\n3 : Sair");
            opcao = input.nextInt();
            if (opcao == 1) {
                System.out.print("Digite a temperatura em Celsius: ");
                temperaturaC = input.nextFloat();
                temperaturaF = (9f * temperaturaC / 5f) + 32f;
                de = "C";
                para = "F";
                System.out.printf("\n• A temperatura %.2f%s é %.2f%s\n", temperaturaC, de, temperaturaF, para);
                System.out.println("Obrigado por usar o conversor!\n");

            } else if (opcao == 2) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperaturaC = ((temperaturaF - 32f) / 9f) * 5f;
                temperaturaF = input.nextFloat();
                de = "F";
                para = "C";
                System.out.printf("\n• A temperatura %.2f%s é %.2f%s\n", temperaturaF, de, temperaturaC, para);
                System.out.println("Obrigado por usar o conversor!\n");
            } else {
                System.out.println("Obrigado por usar o conversor!");

            }
        }
        input.close();

    }
}
