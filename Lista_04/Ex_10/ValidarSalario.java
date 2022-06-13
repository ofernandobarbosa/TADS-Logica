import java.util.Scanner;

// 10. Escreva um algoritmo para ler um salário. O algoritmo deve “validar” a leitura do
// salário para aceitar somente um “salário válido”. Você deve definir o que é um
// “salário válido”. Escrever o salário lido.

public class ValidarSalario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salario=0;

        while (salario<1500) {
            System.out.print("Digite seu salário: R$");
            salario = input.nextFloat();
        }
        System.out.println("O seu salário é R$"+salario);
    }    
}
