import java.util.Scanner;
import java.util.spi.TimeZoneNameProvider;

// 6. Ler o nome de dois times e o número de gols marcados na partida (para cada time).
// Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
// palavra EMPATE.
public class Times {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int golsA, golsB;
        String timeA, timeB;

        System.out.print("Informe o Time A: ");
        timeA = input.next();
        System.out.print("Informe o Time B: ");
        timeB = input.next();

        System.out.print("Informe os gols do "+ timeA);
        golsA = input.nextInt();
        System.out.print("Informe os gols do "+ timeB);
        golsB = input.nextInt();

        if (golsA>golsB){
            System.out.println("O time vencedor é o "+ timeA);
            System.out.println(golsA+"X"+golsB);
        }else if(golsB> golsA){
            System.out.println("O time vencedor é o "+ timeB);
            System.out.println(golsB+"X"+golsA);
        }else{
            System.out.println("O jogo deu empate!");
        }
    }
}
