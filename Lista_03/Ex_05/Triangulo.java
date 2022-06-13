import java.util.Scanner;
// 5. Ler três valores (A, B e C) representando as medidas dos lados de um triângulo e
// escrever se formam ou não um triângulo. Observação: para formar um triângulo, o
// valor de cada lado deve ser menor que a soma dos outros dois lados.
public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ladoA, ladoB, ladoC;

        System.out.println("Digite o lado A");
        ladoA = input.nextInt();
        System.out.println("Digite o lado B");
        ladoB = input.nextInt();
        System.out.println("Digite o lado C");
        ladoC = input.nextInt();

        if (ladoA < ladoB+ladoC && ladoB < ladoA+ladoC && ladoC < ladoA+ladoB){
            System.out.println("O triângulo existe!");
        }else{
            System.err.println("O triângulo NÃO existe!");
        }
    }
}
