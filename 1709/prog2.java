import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int a = Math.abs(number1 - number2);

        System.out.println(number1 + number2);
        System.out.println(a);
        System.out.println((number1 - number2) * (number1 - number2));
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);

        scanner.close();
    }
}
