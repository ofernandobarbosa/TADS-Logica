import java.util.Scanner;

//22. Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
//Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
//Também testar se saldo atual for maior ou igual a zero escrever a mensagem “Saldo
//Positivo”, senão escrever a mensagem “Saldo Negativo”.

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int conta, debito, credito, saldo, saldoAtual, validaConta;
        conta = 1234;
        
        System.out.println("Seja bem-vindo ao Seu Banco!");
        System.out.print("Digite o número da conta: ");
        validaConta = input.nextInt();
        boolean deuCerto = validaConta == conta;
        
        if (deuCerto) {
            System.out.print("Digite seu saldo: ");
            saldo = input.nextInt();
            System.out.print("Digite seu débito: ");
            debito = input.nextInt();
            System.out.print("Digite seu crédito: ");
            credito = input.nextInt();
            
            saldoAtual = saldo - debito + credito;
            
            System.out.println("● Saldo atual é de R$"+saldoAtual);
            if (saldoAtual<0){
                System.out.println("● Saldo Negativo!!");
            }else{
                System.out.println("● Saldo Positivo!!");
            }
            
        }else{
            System.out.println("Conta incorreta!!!!");
        }
        
    }
}