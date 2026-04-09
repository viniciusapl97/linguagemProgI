def gerar_mensagem_boas_vindas(nome, idade):
    # Aqui eu deixei a função responsável por montar a frase completa
    return f"Olá, {nome}! Seja bem-vindo(a)! Você tem {idade} anos."

nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))
mensagem = gerar_mensagem_boas_vindas(nome, idade)
print(mensagem)