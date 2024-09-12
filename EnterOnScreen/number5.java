import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int result = number / 100 * 100;

        System.out.println(result);

        scanner.close();
    }
}
