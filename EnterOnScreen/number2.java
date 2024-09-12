import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод натурального числа
        int number = scanner.nextInt();

        // Получаем младший разряд числа
        int lastDigit = number % 10;

        // Выводим младший разряд на экран
        System.out.println(lastDigit);

        // Закрываем Scanner
        scanner.close();
    }
}
