#include <iostream>
using namespace std; // Evita ter que escrever std:: toda hora

int main() {
    // Alocando variáveis na memória antes de usar (característica de linguagens robustas)
    double num1, num2;
    
    cout << "--- Calculadora Basica ---" << endl;
    cout << "Digite o primeiro numero: ";
    cin >> num1; // Extrai o valor digitado para a variável
    
    cout << "Digite o segundo numero: ";
    cin >> num2;
    
    cout << "Soma: " << (num1 + num2) << endl;
    cout << "Subtracao: " << (num1 - num2) << endl;
    cout << "Multiplicacao: " << (num1 * num2) << endl;
    
    // Tratamento sequencial contra quebra por divisão por zero
    if (num2 == 0) {
        cout << "Erro: Nao e possivel realizar divisao por zero!" << endl;
    } else {
        cout << "Divisao: " << (num1 / num2) << endl;
    }
    
    return 0; // Indica pro SO que a execução ocorreu sem erros
}