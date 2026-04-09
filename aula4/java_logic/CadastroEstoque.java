import java.util.Scanner;

public class CadastroEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Cadastro de Produto no MVP ---");
        
        System.out.print("Nome do produto: ");
        String nomeDoProduto = entrada.nextLine(); // Em Java, string é tratada como um Objeto (inicia com letra maiúscula)
        
        System.out.print("Quantidade em estoque: ");
        int quantidadeEmEstoque = entrada.nextInt();
        
        System.out.print("Preco unitario: ");
        double precoUnitario = entrada.nextDouble();
        
        // Blindagem do sistema
        if (quantidadeEmEstoque < 0) {
            System.out.println("Erro: A quantidade nao pode ser um valor negativo. Por favor, tente novamente.");
        } else {
            System.out.println("\n--- Resumo do Produto Cadastrado ---");
            System.out.println("Produto: " + nomeDoProduto);
            System.out.println("Quantidade: " + quantidadeEmEstoque);
            System.out.println("Preco: R$ " + precoUnitario);
        }
        
        entrada.close();
    }
}
