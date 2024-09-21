import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int result = 1 << N;

        System.out.println(result);

        scanner.close();
    }
}
