import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        n = input.nextInt();

        while (n > 0) {
            if (n % 2 == 0){
                n*=n;
                System.out.println(n);
            }
            n--;
        }

    }
}
