import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод натурального двузначного числа
        int number = scanner.nextInt();

        // Проверяем, что число действительно двузначное

        // Получаем старший и младший разряды числа
        int firstDigit = number / 10;
        int lastDigit = number % 10;

        // Вычисляем сумму разрядов
        int sumOfDigits = firstDigit + lastDigit;

        // Выводим результаты на экран
        System.out.println(firstDigit+ " " + lastDigit+ " " + sumOfDigits);

        // Закрываем Scanner
        scanner.close();
    }
}
