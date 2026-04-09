import java.util.Scanner;
import java.util.ArrayList; // Biblioteca vital para criarmos listas que crescem dinamicamente

// Essa classe é para estabelecer o contrato do que é um Produto na nossa "regra de negócios."
class Produto {
    String nome;
    int quantidade;
    double preco;
    
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Lista dinâmica fortemente tipada. Só aceita objetos da nossa classe Produto!
        ArrayList<Produto> estoque = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("\n--- Gerenciador de Estoque ---");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Sair");
            System.out.print("Opcao: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpeza do buffer do teclado (importante em Java)
            
            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = entrada.nextLine();
                
                System.out.print("Quantidade: ");
                int quantidade = entrada.nextInt();
                
                if (quantidade < 0) {
                    System.out.println("Erro: Quantidade nao pode ser negativa!");
                } else {
                    System.out.print("Preco: ");
                    double preco = entrada.nextDouble();
                    
                    estoque.add(new Produto(nome, quantidade, preco));
                    System.out.println("Produto cadastrado!");
                }
            } 
            else if (opcao == 2) {
                System.out.println("\n--- Produtos em Estoque ---");
                if (estoque.isEmpty()) {
                    System.out.println("Estoque vazio.");
                } else {
                    for (Produto p : estoque) {
                        System.out.println("Produto: " + p.nome + " | Qtd: " + p.quantidade + " | Preco: R$" + p.preco);
                    }
                }
            }
        } while (opcao != 3);
        
        entrada.close();
    }
}