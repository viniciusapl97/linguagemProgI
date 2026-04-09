import java.util.Scanner;

public class DesafioFinalEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomesInsumos = new String[3];
        int[] quantidades = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do " + (i + 1) + " produto: ");
            nomesInsumos[i] = entrada.nextLine();

            System.out.print("Digite a quantidade de " + nomesInsumos[i] + ": ");
            quantidades[i] = Integer.parseInt(entrada.nextLine());
        }

        System.out.println("\nRelatorio final de estoque:");
        for (int i = 0; i < 3; i++) {
            if (quantidades[i] < 5) {
                System.out.println("Produto: " + nomesInsumos[i] + " | Estoque: " + quantidades[i] + " unidades [REPOSICAO NECESSARIA]");
            } else {
                System.out.println("Produto: " + nomesInsumos[i] + " | Estoque: " + quantidades[i] + " unidades");
            }
        }

        entrada.close();
    }
}