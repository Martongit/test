public class PercentualFaturamento {

    public static void main(String[] args) {
        // Dados de faturamento por estado
        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
        double[] faturamentos = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

        // Calcula o total de faturamento
        double totalFaturamento = 0;
        for (double faturamento : faturamentos) {
            totalFaturamento += faturamento;
        }

        // Imprime o percentual de representação de cada estado
        System.out.println("Percentual de representação de cada estado no faturamento total:");

        for (int i = 0; i < estados.length; i++) {
            String estado = estados[i];
            double faturamento = faturamentos[i];
            double percentual = (faturamento / totalFaturamento) * 100;
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}
