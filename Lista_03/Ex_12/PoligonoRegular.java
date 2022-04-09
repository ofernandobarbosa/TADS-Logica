// 12. Acrescente as seguintes mensagens à solução do exercício anterior conforme o
// caso
// - Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
// - Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO
// IDENTIFICADO.
// Observação: Considere que o usuário poderá informar qualquer valor para o número
// de lados.
import java.util.Scanner;

public class PoligonoRegular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lados = -1, perimetro = 0, comprimento;
        String tipo = "";

        System.out.print("Quantos lados tem o seu polígono? ");
        lados = input.nextInt();

        if (lados <3) {
            System.out.println("NÃO É UM POLÍGONO!");
        } else if(lados>5){
            System.out.println("POLÍGONO NÃO IDENTIFICADO!");
        }else{
            System.out.print("Qual o comprimento de um dos lados? ");
            comprimento = input.nextInt();

            if (lados == 3) {
                tipo = "TRIÂNGULO!";
            } else if (lados == 4) {
                tipo = "QUADRADO!";
            } else if (lados == 5) {
                tipo = "PENTÁGONO!";
            }
            perimetro = lados * comprimento;
            System.out.println("O polígono é um " + tipo);
            System.out.println("Seu perímetro é de " + perimetro);
        }
    }
}
