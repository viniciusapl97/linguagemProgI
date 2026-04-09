import java.util.Scanner;



public class Exercicio4Procedural {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("VERSAO 1 - PROCEDURAL");
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(entrada.nextLine());
        System.out.println("Ola, " + nome + "! Seja bem-vindo(a)! Voce tem " + idade + " anos.");


        entrada.close();
    }
}

