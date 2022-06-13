import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float raio, volume, pi=3.14159f;
        raio = input.nextInt();
        
        volume = (4/3)*pi*(raio*raio*raio);
        
        System.out.printf("%.3f", volume);
        
 
    }
 
}