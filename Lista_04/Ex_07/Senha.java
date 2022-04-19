import java.util.Scanner;

// 7. Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta
// que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O
// algoritmo deve também contar quantas vezes o usuário tentou digitar a senha
// correta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa
// informação na tela.
public class Senha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senha = 12345, tentativa = 0, qteTentativas = 0;

        while (senha != tentativa) {
            System.out.print("Digite sua senha: ");
            tentativa = input.nextInt();
            qteTentativas++;
        }
        System.out.printf("Você tentou %d vezes.\n", qteTentativas);
    }
}
