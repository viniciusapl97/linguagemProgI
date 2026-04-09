
#include <iostream>
#include <string>
using namespace std;

bool validarSenha(string senha) {
    // Em C++, bool também encaixa muito bem na lógica de repetição
    return senha.length() >= 8;
}

int main() {
    string senha;


    cout << "Digite uma senha: ";
    getline(cin, senha);

    while (!validarSenha(senha)) {
        cout << "Senha invalida. Digite pelo menos 8 caracteres." << endl;
        cout << "Digite uma senha: ";
        getline(cin, senha);
    }

    cout << "Senha valida." << endl;

    return 0;
}
