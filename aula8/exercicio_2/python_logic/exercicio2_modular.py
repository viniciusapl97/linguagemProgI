def calcular_area_retangulo(base, altura):
    # Aqui a função devolve o valor calculado para o programa principal
    return base * altura

base = float(input("Digite a base do retângulo: "))
altura = float(input("Digite a altura do retângulo: "))
area = calcular_area_retangulo(base, altura)
print(f"Área do retângulo: {area}")