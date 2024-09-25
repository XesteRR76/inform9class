import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t1n = scanner.nextDouble();
        double t2n = scanner.nextDouble();
        double t1k = scanner.nextDouble();
        double t2k = scanner.nextDouble();
        double cT1 = scanner.nextDouble();
        double cT2 = scanner.nextDouble();

        double dnevnoe = t1k - t1n;
        double nochnoe = t2k - t2n;
        double sumT1 = dnevnoe * cT1;
        double sumT2 = nochnoe * cT2;
        double totalSum = sumT1 + sumT2;

        System.out.printf("%.2f %.2f\n", dnevnoe, nochnoe);
        System.out.printf("%.2f %.2f\n", sumT1, sumT2);
        System.out.printf("%.2f\n", totalSum);

        scanner.close();
    }
}
