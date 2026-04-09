def calculadora():
    print("--- Calculadora Básica ---")
    # Cast para float já que o input sempre retorna texto (str)
    num1 = float(input("Digite o primeiro número: "))
    num2 = float(input("Digite o segundo número: "))
    
    # Operações aritméticas básicas do roteiro
    print(f"Soma: {num1 + num2}")
    print(f"Subtração: {num1 - num2}")
    print(f"Multiplicação: {num1 * num2}")
    
    # Validação para evitar o erro fatal de divisão por zero
    if num2 == 0:
        print("Erro: Não é possível realizar divisão por zero!")
    else:
        print(f"Divisão: {num1 / num2}")

calculadora()