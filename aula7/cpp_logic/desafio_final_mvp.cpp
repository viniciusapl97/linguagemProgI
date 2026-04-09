#include <iostream>
#include <vector>
#include <string>
using namespace std;

void exibirCabecalho() {
    // Essa função cuida só da identidade visual do terminal
    cout << "\n===================================" << endl;
    cout << "      SORVETERIA DO DENER" << endl;
    cout << "===================================" << endl;
}

string verificarEstoqueCritico(int quantidade) {
    // Aqui a função retorna a etiqueta de reposição quando necessário
    if (quantidade < 5) {
        return " [REPOSICAO NECESSARIA]";
    }
    return "";
}

void listarProdutos(vector<string>& nomes, vector<int>& quantidades) {
    // Estou percorrendo os dois vetores em paralelo para montar o relatório
    cout << "\nRelatorio de estoque:" << endl;
    for (int i = 0; i < nomes.size(); i++) {
        string alerta = verificarEstoqueCritico(quantidades[i]);
        cout << "Produto: " << nomes[i] << " | Estoque: " << quantidades[i] << " unidades" << alerta << endl;
    }
}

int main() {
    vector<string> nomes;
    vector<int> quantidades;

    exibirCabecalho();

    for (int i = 0; i < 3; i++) {
        string nome;
        int quantidade;

        cout << "Digite o nome do " << (i + 1) << " produto: ";
        getline(cin, nome);

        cout << "Digite a quantidade de " << nome << ": ";
        cin >> quantidade;
        cin.ignore();

        nomes.push_back(nome);
        quantidades.push_back(quantidade);
    }

    int opcao = 0;

    while (opcao != 3) {
        cout << "\n1. Listar estoque" << endl;
        cout << "2. Adicionar novo produto" << endl;
        cout << "3. Sair" << endl;
        cout << "Escolha uma opcao: ";
        cin >> opcao;
        cin.ignore();

        if (opcao == 1) {
            exibirCabecalho();
            listarProdutos(nomes, quantidades);
        } else if (opcao == 2) {
            string nome;
            int quantidade;

            cout << "Digite o nome do novo produto: ";
            getline(cin, nome);

            cout << "Digite a quantidade de " << nome << ": ";
            cin >> quantidade;
            cin.ignore();

            nomes.push_back(nome);
            quantidades.push_back(quantidade);

            cout << "Produto cadastrado com sucesso." << endl;
        } else if (opcao == 3) {
            cout << "Sistema encerrado." << endl;
        } else {
            cout << "Opcao invalida." << endl;
        }
    }

    return 0;
}