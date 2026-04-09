import java.util.Scanner;

public class Exercicio1Modular {

    public static void verificarParidade(int numero) {
        // O método recebe o número e exibe o resultado sem retornar valor
        if (numero % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        System.out.print("Digite um numero inteiro: ");
        numero = entrada.nextInt();
        verificarParidade(numero);

        entrada.close();
    }
}