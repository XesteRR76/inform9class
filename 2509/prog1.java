import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double absNumber = Math.abs(number);
        double squareNumber = Math.pow(number, 2);
        double numberTimesPi = number * Math.PI;
        double atanNumber = Math.atan(number);
        double tanNumber = Math.tan(number);
        System.out.printf("%.3f\n", absNumber);
        System.out.printf("%.3f\n", squareNumber);
        System.out.printf("%.3f\n", numberTimesPi);
        System.out.printf("%.3f\n", atanNumber);
        System.out.printf("%.3f\n", tanNumber);
        scanner.close();
    }
}
