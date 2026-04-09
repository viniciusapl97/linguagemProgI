def cadastrar_produto():
    print("--- Cadastro de Produto no MVP ---")
    
    nome_do_produto = input("Nome do produto: ")
    quantidade_em_estoque = int(input("Quantidade em estoque: "))
    preco_unitario = float(input("Preço unitário: "))

    # Regra de negócio: impedindo a corrupção do banco de dados do MVP com estoque negativo.
    if quantidade_em_estoque < 0:
        print("Erro: A quantidade não pode ser um valor negativo. Por favor, tente novamente.")
    else:
        # Se os dados são íntegros, geramos o relatório do produto.
        print("\n--- Resumo do Produto Cadastrado ---")
        print(f"Produto: {nome_do_produto}")
        print(f"Quantidade: {quantidade_em_estoque}")
        print(f"Preço: R$ {preco_unitario:.2f}")

cadastrar_produto()