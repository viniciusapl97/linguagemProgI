
import java.util.Scanner;

public class Exercicio4Modular {

    public static String gerarMensagemBoasVindas(String nome, int idade) {
        // O método retorna a frase pronta para o main só imprimir
        return "Ola, " + nome + "! Seja bem-vindo(a)! Voce tem " + idade + " anos.";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        int idade = Integer.parseInt(entrada.nextLine());
        
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        idade = Integer.parseInt(entrada.nextLine());
        String mensagem = gerarMensagemBoasVindas(nome, idade);
        System.out.println(mensagem);

        entrada.close();
    }
}