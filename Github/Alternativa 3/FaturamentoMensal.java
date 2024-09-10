public class FaturamentoMensal {

    public static void main(String[] args) {
        String jsonData = "[{\"valor\": 1500}, {\"valor\": 2000}, {\"valor\": 0}, {\"valor\": 2500}, {\"valor\": 1000}, {\"valor\": 3000}, {\"valor\": 0}]";

        jsonData = jsonData.substring(1, jsonData.length() - 1);
        String[] entries = jsonData.split("\\},\\{");

        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double somaValores = 0;
        int diasComFaturamento = 0;

        for (String entry : entries) {
            entry = entry.replaceAll("[{}\"]", "");
            String[] keyValuePairs = entry.split(",");
            double valor = 0;

            for (String pair : keyValuePairs) {
                String[] keyValue = pair.split(":");
                if (keyValue[0].trim().equals("valor")) {
                    valor = Double.parseDouble(keyValue[1].trim());
                    break;
                }
            }

            if (valor > 0) {
                somaValores += valor;
                diasComFaturamento++;
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > maiorValor) { 
                    maiorValor = valor;
                }
            }
        }

        double mediaMensal = diasComFaturamento > 0 ? somaValores / diasComFaturamento : 0;

        int diasAcimaMedia = 0;
        for (String entry : entries) {
            entry = entry.replaceAll("[{}\"]", "");
            String[] keyValuePairs = entry.split(",");
            double valor = 0;

            for (String pair : keyValuePairs) {
                String[] keyValue = pair.split(":");
                if (keyValue[0].trim().equals("valor")) {
                    valor = Double.parseDouble(keyValue[1].trim());
                    break;
                }
            }

            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaMedia);
    }
}
