// Exercício 3 - Validador de Senha
import java.util.Scanner;

public class Exercicio3Modular {

    public static boolean validarSenha(String senha) {
        // O retorno booleano facilita muito usar a função dentro do while
        return senha.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha = entrada.nextLine();

        System.out.print("Digite uma senha: ");
        senha = entrada.nextLine();

        while (!validarSenha(senha)) {
            System.out.println("Senha invalida. Digite pelo menos 8 caracteres.");
            System.out.print("Digite uma senha: ");
            senha = entrada.nextLine();
        }

        System.out.println("Senha valida.");

        entrada.close();
    }
}