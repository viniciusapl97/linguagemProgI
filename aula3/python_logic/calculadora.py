from unittest import case



def soma(num1,num2):
    return num1 + num2

def subtracao(num1,num2):
    return num1 - num2  

def multiplicacao(num1,num2):
    return num1 * num2

def divisao(num1,num2):
    if num2 != 0:
        return num1 / num2
    else:
        return "Erro: Divisão por zero não é permitida."


def calculadora():
    calc=True
    

    while calc==True:

        print("Escolha a operação:")
        print("1 - Adição")
        print("2 - Subtração")  
        print("3 - Multiplicação")  
        print("4 - Divisão")    
        print("5 - Encerrar")  

        escolha = int(input("Digite o número da operação desejada:"))
       
        num1 = int(input("Digite o primeiro número:"))
        num2 = int(input("Digite o segundo número:"))

        
        match escolha:

            case 1:            
                resultado = soma(num1,num2)
                print(f"O resultado da adição é: {resultado}")

            case 2:            
                resultado = subtracao(num1,num2)
                print(f"O resultado da subtração é: {resultado}")

            case 3:            
                resultado = multiplicacao(num1,num2)
                print(f"O resultado da multiplicação é: {resultado}")

            case 4:            
                resultado = divisao(num1,num2)
                print(f"O resultado da divisão é: {resultado}")

            case 5:
                print("Encerrando a calculadora. Até mais!")
                calc=False
                



calculadora()
