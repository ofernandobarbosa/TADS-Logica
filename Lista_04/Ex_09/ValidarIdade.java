import java.util.Scanner;
// 9. Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente
// idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem
// que ser maior que 0 e menor que 150. Escrever a idade lida.

public class ValidarIdade {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int idade=-1;

        while (idade < 0 || idade>150){
            System.err.print("Digite sua idade: ");
            idade = input.nextInt();
            if (idade < 0 || idade>150){
                System.out.println("Digite uma idade válida (0-150)");
            }
        }
        System.out.printf("Sua idade é %d anos.", idade);
    }
}
