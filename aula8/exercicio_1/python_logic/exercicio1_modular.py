
def verificar_paridade(numero):
    # Essa função recebe o número e apenas imprime a classificação
    if numero % 2 == 0:
        print("O número é par.")
    else:
        print("O número é ímpar.")

numero = int(input("Digite um número inteiro: "))
verificar_paridade(numero)