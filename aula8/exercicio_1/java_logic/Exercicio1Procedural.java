import java.util.Scanner;

public class Exercicio1Procedural {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }


        entrada.close();
    }
}