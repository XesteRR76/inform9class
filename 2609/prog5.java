import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double sum = a + b;
        double diff = a - b;
        double prod = a * b;
        double quot = a / b;
        double pow = Math.pow(a, b);
        System.out.printf("%.3f\n", sum);
        System.out.printf("%.3f\n", diff);
        System.out.printf("%.3f\n", prod);
        System.out.printf("%.3f\n", quot);
        System.out.printf("%.3f\n", pow);
        scanner.close();
    }
}
