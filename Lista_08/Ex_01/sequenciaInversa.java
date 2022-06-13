//1. Dada uma sequência de n números, imprimi-la na ordem inversa à da leitura.

public class sequenciaInversa {
    public static void main(String[] args) {
        int[] entrada = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int tam = entrada.length - 1;

        for (int i = 0; i < entrada.length; i++) {
            System.out.print(entrada[tam - i] + " ");
        }
        System.out.println();
    }
};