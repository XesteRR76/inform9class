import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt() +5;

        int remainder = number % 10;
        number = number - remainder;  
        

        System.out.println(number);

        scanner.close();
    }
}
