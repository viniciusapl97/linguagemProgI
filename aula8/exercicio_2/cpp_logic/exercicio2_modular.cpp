#include <iostream>
using namespace std;

double calcularAreaRetangulo(double base, double altura) {
    // Aqui a função retorna um valor numérico para o main usar depois
    return base * altura;
}

int main() {
    double base, altura, area;


    cout << "Digite a base do retangulo: ";
    cin >> base;
    cout << "Digite a altura do retangulo: ";
    cin >> altura;
    area = calcularAreaRetangulo(base, altura);
    cout << "Area do retangulo: " << area << endl;

    return 0;
}