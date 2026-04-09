
def validar_senha(senha):
    # A função devolve True ou False para o laço decidir se continua
    return len(senha) >= 8

senha = input("Digite uma senha: ")

while not validar_senha(senha):
    print("Senha inválida. Digite pelo menos 8 caracteres.")
    senha = input("Digite uma senha: ")

print("Senha válida.")