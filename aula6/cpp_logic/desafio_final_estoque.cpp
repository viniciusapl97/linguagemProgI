#include <iostream>
#include <string>
using namespace std;

int main() {
    string nomesInsumos[3];
    int quantidades[3];

    for (int i = 0; i < 3; i++) {
        cout << "Digite o nome do " << (i + 1) << " produto: ";
        getline(cin, nomesInsumos[i]);

        cout << "Digite a quantidade de " << nomesInsumos[i] << ": ";
        cin >> quantidades[i];
        cin.ignore();
    }

    cout << "\nRelatorio final de estoque:" << endl;
    for (int i = 0; i < 3; i++) {
        if (quantidades[i] < 5) {
            cout << "Produto: " << nomesInsumos[i]
                 << " | Estoque: " << quantidades[i]
                 << " unidades [REPOSICAO NECESSARIA]" << endl;
        } else {
            cout << "Produto: " << nomesInsumos[i]
                 << " | Estoque: " << quantidades[i]
                 << " unidades" << endl;
        }
    }

    return 0;
}