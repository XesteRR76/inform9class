import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        double x = in.nextDouble();
        double y = in.nextDouble();
        double a =  Math.atan(y / x);
        double c = Math.sqrt(x * x + y * y);
        out.printf("%.3f\n", c);
        out.printf("%.3f\n", a);
        out.printf("%.3f\n", y / c);
        out.printf("%.3f\n", x / c);
        out.printf("%.3f\n", y / x);
    }
}
