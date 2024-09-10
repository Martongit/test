import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string para inverter:");
        String entrada = scanner.nextLine();
        scanner.close();
        
        String invertida = inverterString(entrada);
        
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int n = caracteres.length;

        char[] invertida = new char[n];
        
        for (int i = 0; i < n; i++) {
            invertida[i] = caracteres[n - 1 - i];
        }
        
        return new String(invertida);
    }
}
