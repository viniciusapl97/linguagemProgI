import java.util.Scanner;

public class Exercicio2Modular {

    public static double calcularAreaRetangulo(double base, double altura) {
        // Em Java eu declaro o tipo de retorno antes do nome do método
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Digite a base do retangulo: ");
        base = entrada.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        altura = entrada.nextDouble();
        area = calcularAreaRetangulo(base, altura);
        System.out.println("Area do retangulo: " + area);

        entrada.close();
    }
}