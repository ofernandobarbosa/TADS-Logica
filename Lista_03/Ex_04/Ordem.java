import java.util.Scanner;
// 4. Ler três valores (considere que não serão informados valores iguais) e escrevê-los
// em ordem crescente.
public class Ordem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1, valor2, valor3;
        int posi1=0, posi2=0, posi3=0;

        valor1 = input.nextInt();
        valor2 = input.nextInt();
        valor3 = input.nextInt();
        
        if (valor1<valor2 && valor1<valor3){
            posi1 = valor1;
        } else if(valor2< valor1 && valor2<valor3){
            posi1 = valor2;
        }else if(valor3<valor1 && valor3<valor2){
            posi1 = valor3;
        }

        if (valor1<valor2 && valor1>valor3){
            posi2 = valor1;
        } else if(valor2< valor1 && valor2>valor3){
            posi2 = valor2;
        }else if(valor3<valor1 && valor3>valor2){
            posi2 = valor3;
        }

        if (valor1>valor2 && valor1>valor3){
            posi3 = valor1;
        } else if(valor2> valor1 && valor2>valor3){
            posi3 = valor2;
        }else if(valor3>valor1 && valor3>valor2){
            posi3 = valor3;
        }

        System.out.println(posi1+" "+posi2+" "+posi3);

    }
}
