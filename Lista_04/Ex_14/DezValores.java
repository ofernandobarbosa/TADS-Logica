import java.util.Scanner;
// 14. Ler 10 valores e escrever quantos desses valores lidos estão compreendidos entre o
// intervalo de 1 até 10. Mostre a multiplicação entre valores digitados no intervalo de 0
// e 10, e a soma dos valores fora deste intervalo.

public class DezValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int iter=0, contIntervalo=0, numero, multiplica=1, soma=0;

        while(iter<10){
            numero = input.nextInt();
            if (numero>=1 && numero<=10){
                contIntervalo++;
                multiplica *=numero;
            }else{
                soma+=numero;
            }
            iter++;
        }
        System.out.printf("%d valores estão no compreendidos entre 1 e 10.\n", contIntervalo);
        System.err.printf("A multiplicação desses números é %d.\n", multiplica);
        System.out.printf("A soma entre os números fora do intervalo é de %d.\n", soma);
    }
}
