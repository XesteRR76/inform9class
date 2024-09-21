import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int remainder = N % 32;
        int result = N + (32 - remainder);

        System.out.println(result);

        scanner.close();
    }
}
