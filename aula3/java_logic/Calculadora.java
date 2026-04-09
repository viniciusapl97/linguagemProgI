import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Instanciando o Scanner para ler as entradas do usuário
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Calculadora Basica ---");
        System.out.print("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble(); // Tipagem estática exigida pelo Java
        
        System.out.print("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();
        
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtracao: " + (num1 - num2));
        System.out.println("Multiplicacao: " + (num1 * num2));
        
        // Validação com if/else para proteger a memória de erros matemáticos
        if (num2 == 0) {
            System.out.println("Erro: Nao e possivel realizar divisao por zero!");
        } else {
            System.out.println("Divisao: " + (num1 / num2));
        }
        
        entrada.close(); // Liberando recursos da memória
    }
}