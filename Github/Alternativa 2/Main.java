import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (Fibo(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean Fibo(int n) {
        return Quad_perf(5 * n * n + 4) || Quad_perf(5 * n * n - 4);
    }

    public static boolean Quad_perf(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }
}