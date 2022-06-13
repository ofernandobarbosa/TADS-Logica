// 8. Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipio.
// A entrada de dados será:
//  ● Número total de eleitores;
//  ● Número de votos válidos;
//  ● Número de votos brancos;
//  ● Número de votos nulos.
// O algoritmo deve calcular e exibir para o usuário as seguintes informações (emrelação ao total de eleitores):
//  ● Percentual de votos válidos;
//  ● Percentual de votos brancos;
//  ● Percentual de votos nulos;

import java.util.Scanner;

public class ResultadoEleicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalEleitores, votosValidos,votosBrancos, votosNulos;
        double percentualValidos, percentualBrancos, percentualNulos;

        System.out.print("Qual número total de eleitores? ");
        totalEleitores = input.nextInt();
        System.out.print("Qual número total de votos válidos? ");
        votosValidos = input.nextInt();
        System.out.print("Qual número total de votos brancos? ");
        votosBrancos = input.nextInt();
        System.out.print("Qual número total de votos nulos? ");
        votosNulos = input.nextInt();

        percentualValidos = (votosValidos*100)/totalEleitores;
        percentualBrancos = (votosBrancos*100)/totalEleitores;
        percentualNulos = (votosNulos*100)/totalEleitores;

        System.out.println(">>>>>>>>>>>> Resultado <<<<<<<<<<<<");
        System.out.printf("● Percentual de votos válidos -> %.2f%%\n", percentualValidos);
        System.out.printf("● Percentual de votos brancos -> %.2f%%\n", percentualBrancos);
        System.out.printf("● Percentual de votos nulos -> %.2f%%\n", percentualNulos);
        
    }
}
