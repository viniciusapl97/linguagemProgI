#include <iostream>
#include <string>
#include <vector>

using namespace std;

// uma 'struct' (estrutura) é perfeita para agrupar as variáveis
// de um produto e criar um novo tipo de dado para a nossa lista.
struct Produto {
    string nome;
    int quantidade;
    double preco;
};

int main() {
    // Vector é o equivalente ao ArrayList do Java, uma lista que cresce conforme o uso.
    vector<Produto> estoque;
    int opcao;
    
    do {
        cout << "\n--- Gerenciador de Estoque ---" << endl;
        cout << "1. Adicionar produto\n2. Listar produtos\n3. Sair\nOpcao: ";
        cin >> opcao;
        
        if (opcao == 1) {
            Produto p;
            cout << "Nome do produto: ";
            cin.ignore(); // Limpa o buffer antes de ler string com espaços
            getline(cin, p.nome);
            
            cout << "Quantidade: ";
            cin >> p.quantidade;
            
            if (p.quantidade < 0) {
                cout << "Erro: Quantidade nao pode ser negativa!" << endl;
            } else {
                cout << "Preco: ";
                cin >> p.preco;
                
                // O método push_back() joga o produto para o final do vetor
                estoque.push_back(p);
                cout << "Produto cadastrado!" << endl;
            }
        } 
        else if (opcao == 2) {
            cout << "\n--- Produtos em Estoque ---" << endl;
            if (estoque.empty()) {
                cout << "Estoque vazio." << endl;
            } else {
                // Iteração com for-each em C++ usando referência constante para otimizar memória
                for (const auto& prod : estoque) {
                    cout << "Produto: " << prod.nome << " | Qtd: " << prod.quantidade 
                         << " | Preco: R$" << prod.preco << endl;
                }
            }
        }
    } while (opcao != 3);
    
    return 0;
}