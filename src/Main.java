import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //2
        double x = -2;
        double end = 4;
        double step = 0.3;

        while (x <= end) {
            double y = Math.pow(Math.sin(x), 2) + x / 2;
            System.out.printf("x = %.2f, y = %.2f%n", x, y);
            x += step;
        }
        //3
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        System.out.println("Введіть додатні числа (0 для завершення):");

        int input;
        while ((input = scanner.nextInt()) != 0) {
            if (input >= 65 && input <= 90) {
                char character = (char) input;
                result.append(character);
            }
        }

        System.out.println("Рядок результату: " + result.toString());
        //4
        Scanner scanner1 = new Scanner(System.in);
        int count = 0;

        System.out.println("Введіть рядки (введіть 'done' для завершення):");

        while (true) {
            String input1 = scanner1.nextLine();

            if (input1.equals("done")) {
                break;
            }

            boolean isDigitLine = true;
            if (!input1.isEmpty()) {
                for (char c : input1.toCharArray()) {
                    if (!Character.isDigit(c)) {
                        isDigitLine = false;
                        break;
                    }
                }
            } else {
                isDigitLine = false;
            }

            if (isDigitLine) {
                count++;
            }
        }

        System.out.println("Кількість рядків, що складаються виключно з цифр: " + count);
    }
}