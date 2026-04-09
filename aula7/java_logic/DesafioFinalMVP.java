import java.util.ArrayList;
import java.util.Scanner;

public class DesafioFinalMVP {

    public static void exibirCabecalho() {
        // Método responsável só pela apresentação visual do sistema
        System.out.println("\n===================================");
        System.out.println("      SORVETERIA DO DENER");
        System.out.println("===================================");
    }

    public static String verificarEstoqueCritico(int quantidade) {
        // Aqui eu devolvo uma string para o programa principal decidir como exibir
        if (quantidade < 5) {
            return " [REPOSICAO NECESSARIA]";
        }
        return "";
    }

    public static void listarProdutos(ArrayList<String> nomes, ArrayList<Integer> quantidades) {
        System.out.println("\nRelatorio de estoque:");
        for (int i = 0; i < nomes.size(); i++) {
            String alerta = verificarEstoqueCritico(quantidades.get(i));
            System.out.println("Produto: " + nomes.get(i) + " | Estoque: " + quantidades.get(i) + " unidades" + alerta);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();

        exibirCabecalho();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do " + (i + 1) + " produto: ");
            nomes.add(entrada.nextLine());

            System.out.print("Digite a quantidade: ");
            quantidades.add(Integer.parseInt(entrada.nextLine()));
        }

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n1. Listar estoque");
            System.out.println("2. Adicionar novo produto");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = Integer.parseInt(entrada.nextLine());

            if (opcao == 1) {
                exibirCabecalho();
                listarProdutos(nomes, quantidades);
            } else if (opcao == 2) {
                System.out.print("Digite o nome do novo produto: ");
                nomes.add(entrada.nextLine());

                System.out.print("Digite a quantidade: ");
                quantidades.add(Integer.parseInt(entrada.nextLine()));

                System.out.println("Produto cadastrado com sucesso.");
            } else if (opcao == 3) {
                System.out.println("Sistema encerrado.");
            } else {
                System.out.println("Opcao invalida.");
            }
        }

        entrada.close();
    }
}