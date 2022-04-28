import java.util.Scanner;

// 1. Fazer um programa para ler os dados (matrícula, idade, sexo, altura e
// concursado [S/N]) de váriosfuncionários de uma empresa. O último tem a
// matrícula igual a zero e não entra nos cálculos. Calcular e mostrar:
// a) o número de funcionárias concursadas;
// b) o número de funcionários (somente homens);
// c) a maior idade dos homens concursados;
// d) a quantidade de mulheres com mais de 30 anos sem concurso;
// e) a quantidade de concursados(as);
// f) a média das alturas dos homens com menos de 40 anos
public class Funcionarios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matricula = -1, idade;
        String sexo, concursado;
        float altura;

        int qteFuncionariasConcursadas = 0, qteFuncionarios = 0, maiorIdadeHomem = 0;
        int qteFuncionariasSemConcurso = 0, concursados = 0, alturaHomens = 0, contHomemQuarenta = 0, mediaAltura=0;

        do {
            System.out.print("Número de matrícula:");
            matricula = input.nextInt();
            if (matricula==0) break;
            System.out.print("Idade:");
            idade = input.nextInt();
            System.out.print("Sexo [F/M]:");
            sexo = input.next().toUpperCase();
            System.out.print("Altura:");
            altura = input.nextFloat();
            System.out.print("Concursado? [S/N]:");
            concursado = input.next().toUpperCase();

            if(sexo.equals("F")){
                if (concursado.equals("S")) qteFuncionariasConcursadas++;
                if (concursado.equals("N") && idade > 30) {
                    qteFuncionariasSemConcurso++;
                }
            }
            if(sexo.equals("M")){
                qteFuncionarios++;
                if (idade > maiorIdadeHomem) maiorIdadeHomem = idade;
                if (idade < 40) {
                    alturaHomens += altura;
                    contHomemQuarenta++;
                }
            }
            if (concursado.equals("S")) concursados++;
            mediaAltura = alturaHomens / contHomemQuarenta;
        } while (matricula != 0);
        
        System.out.println("a) o número de funcionárias concursadas: " + qteFuncionariasConcursadas);
        System.out.println("b) o número de funcionários (somente homens): " + qteFuncionarios);
        System.out.println("c) a maior idade dos homens concursados: " + maiorIdadeHomem);
        System.out.println("d) a quantidade de mulheres com mais de 30 anos sem concurso: " + qteFuncionariasSemConcurso);
        System.out.println("e) a quantidade de concursados(as): " + concursados);
        System.out.println("f) a média das alturas dos homens com menos de 40 anos: " + mediaAltura);
    }
}
