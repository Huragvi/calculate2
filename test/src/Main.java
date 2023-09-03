import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в одну строку");
        String str = new String("a" + "b");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Ошибка");
            return;
        }

        int a ;
        char operation;
        int b ;

        try {
            a = Integer.parseInt(parts[0]);
            operation = parts[1].charAt(0);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Неверный ввод.");
            return;
        }
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new IllegalArgumentException("Числа от 1 до 10 включительно");
        }
        if (operation == '+') {
            int result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        } else if (operation == '-') {
            int result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        } else if (operation == '*') {
            int result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        } else if (operation == '/') {
            int result = a / b;
            System.out.println(a + "/" + b + "=" + result);
        } else {
            System.out.println("Ошибка");
        }
    }
}
