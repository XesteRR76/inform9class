import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int distanceSquared = x * x + y * y;

        System.out.println(distanceSquared);

        scanner.close();
    }
}
