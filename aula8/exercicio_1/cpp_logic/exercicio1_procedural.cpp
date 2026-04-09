// Exercício 1 - Verificador de Números
// Aluno: Informática para Negócios - Fatec SBC

#include <iostream>
using namespace std;

void verificarParidade(int numero) {
    // A função recebe o valor e decide se ele é par ou ímpar
    if (numero % 2 == 0) {
        cout << "O numero e par." << endl;
    } else {
        cout << "O numero e impar." << endl;
    }
}

int main() {
    int numero;

    cout << "\nVERSAO 2 - MODULAR COM FUNCOES" << endl;
    cout << "Digite um numero inteiro: ";
    cin >> numero;
    verificarParidade(numero);

    return 0;
}