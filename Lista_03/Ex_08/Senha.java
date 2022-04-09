
/*
Faça um algoritmo para ler um número que é um código de usuário. 
Caso este código seja diferente de um código armazenado internamente 
no algoritmo (igual a 1234) deve ser apresentada a mensagem 
“Usuário inválido!”. Caso o Código seja correto, deve ser lido 
outro valor que é a senha. Se esta senha estiver incorreta 
(a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. 
Caso a senha esteja correta, deve ser mostrada a mensagem 
“Acesso permitido”. 

*/
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigoUsuario, codigoChave = 1234, senhaUsuario, senhaChave = 9999;
        boolean sucesso;

        System.out.print("Digite o código de usuário: ");
        codigoUsuario = input.nextInt();

        if (codigoChave == codigoUsuario){
            System.out.print("Digite sua senha: ");
            senhaUsuario = input.nextInt();
            if (senhaChave==senhaUsuario) {
                System.out.println("Acesso permitido!");
            }else{
                System.out.println("Senha inválida!");
            }
        }else{
            System.out.println("Usuário inválido!");
        }

    }
}
