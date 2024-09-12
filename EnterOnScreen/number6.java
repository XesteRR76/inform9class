import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int remainder = number % 10;
        int result;

        if (remainder >= 5) {
            result = number + (10 - remainder);
        } else {
            result = number - remainder;
        }

        System.out.println(result);

        scanner.close();
    }
}
