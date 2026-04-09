#include <iostream>
using namespace std;

int main() {
    double receita, investimento;
    
    cout << "--- Simulador Financeiro de ROI (MVP3) ---" << endl;
    cout << "Digite a receita total: ";
    cin >> receita;
    
    cout << "Digite o investimento inicial: ";
    cin >> investimento;
    
    // Validação relacional bloqueando a falha matemática do simulador
    if (investimento == 0) {
        cout << "Erro: O investimento nao pode ser zero. Calculo abortado." << endl;
    } else {
        // Uso de parênteses garante que a matemática do ROI seja respeitada no C++
        double roi = (receita - investimento) / investimento;
        cout << "O Retorno sobre o Investimento (ROI) e de: " << roi << endl;
        
        if (roi > 0) {
            cout << "Decisao: Projeto viavel, gerou lucro!" << endl;
        } else {
            cout << "Decisao: Projeto inviavel." << endl;
        }
    }
    
    return 0;
}