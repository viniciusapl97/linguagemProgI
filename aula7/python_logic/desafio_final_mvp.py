def exibir_cabecalho():
    # Essa função centraliza o cabeçalho para evitar repetição visual no sistema
    print("\n===================================")
    print("      SORVETERIA DO DENER")
    print("===================================")

def verificar_estoque_critico(quantidade):
    # Aqui a função recebe a quantidade e devolve uma mensagem de auditoria
    if quantidade < 5:
        return " [REPOSIÇÃO NECESSÁRIA]"
    return ""

def listar_produtos(nomes, quantidades):
    # Essa função percorre as listas em paralelo para montar o relatório
    print("\nRelatório de estoque:")
    for i in range(len(nomes)):
        alerta = verificar_estoque_critico(quantidades[i])
        print(f"Produto: {nomes[i]} | Estoque: {quantidades[i]} unidades{alerta}")

nomes = []
quantidades = []

exibir_cabecalho()

# Primeiro cadastro inicial de 3 insumos, seguindo a ideia do MVP das aulas anteriores
for i in range(3):
    nome = input(f"Digite o nome do {i + 1}º produto: ")
    quantidade = int(input(f"Digite a quantidade de {nome}: "))
    nomes.append(nome)
    quantidades.append(quantidade)

opcao = 0

# Agora o while mantém o sistema ativo para processar a lista de insumos
while opcao != 3:
    print("\n1. Listar estoque")
    print("2. Adicionar novo produto")
    print("3. Sair")
    opcao = int(input("Escolha uma opção: "))

    if opcao == 1:
        exibir_cabecalho()
        listar_produtos(nomes, quantidades)
    elif opcao == 2:
        nome = input("Digite o nome do novo produto: ")
        quantidade = int(input(f"Digite a quantidade de {nome}: "))
        nomes.append(nome)
        quantidades.append(quantidade)
        print("Produto cadastrado com sucesso.")
    elif opcao == 3:
        print("Sistema encerrado.")
    else:
        print("Opção inválida.")