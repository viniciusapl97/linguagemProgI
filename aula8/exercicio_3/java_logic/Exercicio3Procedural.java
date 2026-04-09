// Exercício 3 - Validador de Senha
// Aluno: Informática para Negócios - Fatec SBC

import java.util.Scanner;

public class Exercicio3Procedural {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = entrada.nextLine();

        while (senha.length() < 8) {
            System.out.println("Senha invalida. Digite pelo menos 8 caracteres.");
            System.out.print("Digite uma senha: ");
            senha = entrada.nextLine();
        }

        System.out.println("Senha valida.");

        entrada.close();
    }
}