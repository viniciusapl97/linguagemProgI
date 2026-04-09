def gerenciar_estoque():
    # Em Python, listas são dinâmicas nativamente. 
    # Criar uma lista que vai guardar pequenos dicionários com os dados do produto.
    produtos = []
    
    while True:
        print("\n--- Gerenciador de Estoque ---")
        print("1. Adicionar novo produto")
        print("2. Listar produtos em estoque")
        print("3. Sair")
        
        opcao = input("Escolha uma opção: ")
        
        if opcao == '3':
            print("Encerrando o sistema da Sorveteria...")
            break
            
        elif opcao == '1':
            nome = input("Nome do produto: ")
            quantidade = int(input("Quantidade: "))
            
            # Validação crucial herdada do Roteiro 2
            if quantidade < 0:
                print("Erro: A quantidade não pode ser negativa!")
            else:
                preco = float(input("Preço unitário: "))
                # Salvando o produto na memória da lista
                produtos.append({"nome": nome, "quantidade": quantidade, "preco": preco})
                print(f"Produto '{nome}' cadastrado com sucesso!")
                
        elif opcao == '2':
            print("\n--- Produtos em Estoque ---")
            if not produtos:
                print("O estoque está vazio.")
            else:
                # O laço for varre nossa lista dinâmica para gerar o relatório
                for prod in produtos:
                    print(f"Produto: {prod['nome']} | Qtd: {prod['quantidade']} | Preço: R${prod['preco']:.2f}")
        else:
            print("Opção inválida.")

gerenciar_estoque()