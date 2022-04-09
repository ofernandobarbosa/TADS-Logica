import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.printf("Digite um número: ");
        numero = input.nextInt();

        if (numero>0){
            System.out.println("Numero positivo");
        }else if(numero<0){
            System.err.println("Numero negativo");
        }else {
            System.out.println("Numero é zero");
        }
    }
}
