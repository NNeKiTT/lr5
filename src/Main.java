import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double x = -2;
        double end = 4;
        double step = 0.3;

        while (x <= end) {
            double y = Math.pow(Math.sin(x), 2) + x/2;
            System.out.printf("x = %.2f, y = %.2f%n", x, y);
            x += step;
        }

    }
}