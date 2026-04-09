nomes_insumos = []
quantidades = []

# Aqui eu faço o cadastro de 3 produtos usando duas coleções em paralelo
for i in range(3):
    nome = input(f"Digite o nome do {i + 1}º produto: ")
    quantidade = int(input(f"Digite a quantidade de {nome}: "))

    nomes_insumos.append(nome)
    quantidades.append(quantidade)

print("\nRelatório final de estoque:")
for i in range(3):
    if quantidades[i] < 5:
        print(f"Produto: {nomes_insumos[i]} | Estoque: {quantidades[i]} unidades [REPOSIÇÃO NECESSÁRIA]")
    else:
        print(f"Produto: {nomes_insumos[i]} | Estoque: {quantidades[i]} unidades")