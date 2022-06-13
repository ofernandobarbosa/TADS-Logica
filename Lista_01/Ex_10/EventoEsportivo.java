// Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e
// da renda total de um evento esportivo. Este evento esportivo possui um valor fixo
// cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
// o evento possuem um desconto de 30% no valor do ingresso e as crianças menores
// de 10 anos não pagam ingresso. Baseado nos dados acima apresentados o usuário
// deverá digitar 4 informações de entrada para o sistema, são elas:

// - Valor de cada ingresso
// - Número de pessoas (público do evento) que são sócias do clube
// - Número de pessoas (público do evento) não pagantes (menores de 10 anos)
// - Número de pessoas (público do evento) pagantes (sem desconto algum)

// O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
// e o valor que deixou de ser arrecadada devido aos descontos e isenções.
import java.util.Scanner;

public class EventoEsportivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorIngresso, rendaSocios, rendaPagantes, rendaNaoPagantes, rendaTotal, rendaNaoArrecadada ;
        int socios, naoPagantes, pagantes, totalPessoas;

        System.out.print("Digite o valor do ingresso: ");
        valorIngresso = input.nextDouble();
        System.out.print("Digite o número de sócios: ");
        socios = input.nextInt();
        System.out.print("Digite o número de pagantes: ");
        pagantes = input.nextInt();
        System.out.print("Digite o número de crianças: ");
        naoPagantes = input.nextInt();

        rendaSocios = (valorIngresso * socios) * 0.3;
        rendaPagantes = valorIngresso * pagantes;
        rendaTotal = rendaSocios + rendaPagantes;
        totalPessoas = (socios + pagantes + naoPagantes);
        //Valor que deixou de ser arrecadado.
        rendaNaoArrecadada = (valorIngresso * totalPessoas) - rendaTotal;


        System.out.println(">>>>>>>>>> Balanço geral do evento <<<<<<<<<<");
        System.out.println("● Público total do evento: "+totalPessoas);
        System.out.printf("● Valor total arrecadado: R$%.2f\n", rendaTotal);
        System.out.printf("● Valor não arrecadado devido aos descontos/isenções: R$%.2f\n", rendaNaoArrecadada);



    }
}
