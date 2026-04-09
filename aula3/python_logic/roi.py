def simulador_financeiro():
    print("--- Simulador Financeiro de ROI (MVP3) ---")
    receita = float(input("Digite a receita total do projeto: "))
    investimento = float(input("Digite o valor do investimento: "))
    
    # Bloqueio com if/else exigido pelo roteiro para o investimento
    if investimento == 0:
        print("Erro de Negócio: O investimento não pode ser zero. Cálculo abortado.")
    else:
        # Desafio MVP3: Uso de parênteses para forçar a subtração antes da divisão
        roi = (receita - investimento) / investimento
        print(f"O Retorno sobre o Investimento (ROI) é de: {roi:.2f}")
        
        # Comparação relacional para tomada de decisão
        if roi > 0:
            print("Decisão: Projeto viável, gerou lucro!")
        else:
            print("Decisão: Projeto inviável, gerou prejuízo ou empatou.")

simulador_financeiro()