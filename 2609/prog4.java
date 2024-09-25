import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int integerPart = (int) number;
        double fractionalPart = number - integerPart;
        double nearestInteger = Math.round(number);
        System.out.printf("%d\n", integerPart);
        System.out.printf("%.3f\n", fractionalPart);
        System.out.printf("%d\n", (int) nearestInteger);
        scanner.close();
    }
}
