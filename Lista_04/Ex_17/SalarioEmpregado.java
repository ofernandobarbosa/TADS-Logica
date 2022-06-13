import java.util.Scanner;
// 17. Desenvolva um programa em Java que determine o pagamento bruto de cada um de
// vários empregados. 

// A companhia paga o valor de uma "hora normal" pelas primeiras
// 40 horas trabalhadas de cada empregado

//  e paga o valor de uma "hora extra" (uma e meia a hora normal) 
// para cada hora trabalhada depois de completadas as primeiras 40 horas.

// Seu programa deve primeiramente receber a informação de
// quantos empregados trabalharam durante a semana. Em seguida, receba cada uma
// das informações acima descritas, para cada empregado, e mostre o pagamento
// bruto para cada um deles. O valor da hora de cada empregado deve ser também
// solicitado, pois pode ser diferente para cada empregado.

public class SalarioEmpregado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float valorHoraNormal = 0, valorHoraExtra = 0, pagamentoBruto, valorTotalHorasNormais, valorTotalHorasExtras;
        int contador = 0, qteEmpregados, horasTrabalhadas, horasExtras;

        System.out.print("Quantos empregados trabalham na empresa?");
        qteEmpregados = input.nextInt();

        while (contador < qteEmpregados) {
            System.out.print("Quantas horas foram trabalhadas? ");
            horasTrabalhadas = input.nextInt();
            System.out.print("Qual o valor da hora trabalhada?");
            valorHoraNormal = input.nextFloat();

            if (horasTrabalhadas > 40) {
                horasExtras = horasTrabalhadas - 40;
                valorHoraExtra = 1.5f * valorHoraNormal;
                valorTotalHorasExtras = valorHoraExtra * horasExtras;
                valorTotalHorasNormais = valorHoraNormal * 40;

                pagamentoBruto = valorTotalHorasNormais + valorTotalHorasExtras;

            } else {
                pagamentoBruto = horasTrabalhadas * valorHoraNormal;
            }

            System.out.println("O pagamento bruto do colaborador é R$" + pagamentoBruto);

            contador++;
        }
    }
}
