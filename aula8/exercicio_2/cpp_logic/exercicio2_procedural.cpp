#include <iostream>
using namespace std;


int main() {
    double base, altura, area;

    cout << "Digite a base do retangulo: ";
    cin >> base;
    cout << "Digite a altura do retangulo: ";
    cin >> altura;
    area = base * altura;
    cout << "Area do retangulo: " << area << endl;
    return 0;
}