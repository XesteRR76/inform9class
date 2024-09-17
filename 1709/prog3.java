import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();

        int perimeter = 2 * (length + width);
        int area = length * width;

        System.out.println(perimeter);
        System.out.println(area);

        scanner.close();
    }
}
