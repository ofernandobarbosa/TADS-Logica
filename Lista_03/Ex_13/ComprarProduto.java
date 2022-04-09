import java.util.Scanner;

// 13. Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e
// o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço
// unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
// que:
// - Se quantidade <= 5 o desconto será de 2%
// - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
// - Se quantidade > 10 o desconto será de 5

public class ComprarProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String produto;
        float qteAdquirida, precoUnitario, total, totalAPagar, desconto;

        System.out.print("Qual o produdo a ser adquirido? ");
        produto = input.next();
        System.out.print("Qual a quantidade do produdo a ser adquirido? ");
        qteAdquirida = input.nextFloat();
        System.out.print("Qual o preço do produdo? ");
        precoUnitario = input.nextFloat();

        if (qteAdquirida <= 5) {
            desconto = 0.98f;
        } else if (qteAdquirida > 5f && qteAdquirida <= 10) {
            desconto = 0.97f;
        } else {
            desconto = 0.95f;
        }

        total = qteAdquirida * precoUnitario;
        totalAPagar = total * desconto;
        desconto = (1 - desconto) * total;

        System.out.printf("%.0f de %s :\n", qteAdquirida, produto);
        System.out.println("• O total é R$" + total);
        System.out.println("• O total a pagar é R$" + totalAPagar);
        System.out.printf("• O desconto é de R$%.2f\n", desconto);
    }
}
