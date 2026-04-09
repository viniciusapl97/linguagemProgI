senha = input("Digite uma senha: ")

while len(senha) < 8:
    print("Senha inválida. Digite pelo menos 8 caracteres.")
    senha = input("Digite uma senha: ")

print("Senha válida.")
