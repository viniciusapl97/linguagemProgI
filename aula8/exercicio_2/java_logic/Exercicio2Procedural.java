import java.util.Scanner;

public class Exercicio2Procedural {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = entrada.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = entrada.nextDouble();
        double area = base * altura;
        System.out.println("Area do retangulo: " + area);


        entrada.close();
    }
}