
#include <iostream>
#include <string> // Necessário importar para usar variáveis do tipo texto em C++

using namespace std;

int main() {
    string nome_do_produto;
    int quantidade_em_estoque;
    double preco_unitario;
    
    cout << "--- Cadastro de Produto no MVP ---" << endl;
    
    cout << "Nome do produto: ";
    // getline captura a string inteira, mesmo se houver espaços no nome do produto
    getline(cin, nome_do_produto);
    
    cout << "Quantidade em estoque: ";
    cin >> quantidade_em_estoque;
    
    cout << "Preco unitario: ";
    cin >> preco_unitario;
    
    // Validação de entrada para proteção da regra de negócio
    if (quantidade_em_estoque < 0) {
        cout << "Erro: A quantidade nao pode ser um valor negativo. Por favor, tente novamente." << endl;
    } else {
        cout << "\n--- Resumo do Produto Cadastrado ---" << endl;
        cout << "Produto: " << nome_do_produto << endl;
        cout << "Quantidade: " << quantidade_em_estoque << endl;
        cout << "Preco: R$ " << preco_unitario << endl;
    }
    
    return 0;
}