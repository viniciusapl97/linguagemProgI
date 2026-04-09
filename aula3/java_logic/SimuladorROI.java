import java.util.Scanner;

public class SimuladorROI {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--- Simulador Financeiro de ROI (MVP3) ---");
        System.out.print("Digite a receita total: ");
        double receita = entrada.nextDouble();
        
        System.out.print("Digite o investimento inicial: ");
        double investimento = entrada.nextDouble();
        
        // Bloqueio do cálculo caso investimento seja zero
        if (investimento == 0) {
            System.out.println("Erro: O investimento nao pode ser zero. Calculo abortado.");
        } else {
            // Regra de precedência e associatividade aplicada nos negócios
            double roi = (receita - investimento) / investimento;
            System.out.println("O Retorno sobre o Investimento (ROI) e de: " + roi);
            
            if (roi > 0) {
                System.out.println("Decisao: Projeto viavel, gerou lucro!");
            } else {
                System.out.println("Decisao: Projeto inviavel.");
            }
        }
        
        entrada.close();
    }
}