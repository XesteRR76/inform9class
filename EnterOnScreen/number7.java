import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        int reversedNumber = units * 100 + tens * 10 + hundreds;

        System.out.println(reversedNumber);

        scanner.close();
    }
}
