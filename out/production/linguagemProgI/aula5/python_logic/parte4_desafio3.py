soma_notas = 0

for i in range(5):
    nota = int(input(f"Insira a {i+1} nota: "))
    soma_notas += nota

media = soma_notas / 5
print(f"Sua média é: {media}")