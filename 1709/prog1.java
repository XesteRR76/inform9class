import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int nextNumber = number + 1;
        int doubledNumber = number * 2;
        int oppositeNumber = -number;
        int absoluteNumber = Math.abs(number);
        int squareNumber = number * number;

        System.out.println(nextNumber);
        System.out.println(doubledNumber);
        System.out.println(oppositeNumber);
        System.out.println(absoluteNumber);
        System.out.println(squareNumber);

        scanner.close();
    }
}
