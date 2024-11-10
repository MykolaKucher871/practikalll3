import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Отримуємо дані від користувача
        System.out.print("Введіть ціле число: ");
        int integer = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double floating = scanner.nextDouble();

        System.out.print("Введіть строку: ");
        scanner.nextLine();  // очищуємо буфер
        String string = scanner.nextLine();

        System.out.print("Введіть логічне значення (true або false): ");
        boolean bool = scanner.nextBoolean();

        // Вивід даних у різних форматах

        // 1. Метод String.format()
        System.out.println("1. Ціле число в десятковій системі: " + String.format("%d", integer));
        System.out.println("2. Число з плаваючою точкою до 2 знаків після коми: " + String.format("%.2f", floating));
        System.out.println("3. Строка з фіксованою шириною 20: " + String.format("%20s", string));
        System.out.println("4. Логічне значення: " + String.format("%b", bool));

        // 2. Метод System.out.printf()
        System.out.printf("5. Ціле число в шістнадцятковій системі: %x%n", integer);
        System.out.printf("6. Число з плаваючою точкою до 3 знаків після коми: %.3f%n", floating);
        System.out.printf("7. Строка, обрізана до 10 символів: %.10s%n", string);
        System.out.printf("8. Логічне значення: %b%n", bool);

        // 3. Використання StringBuilder для форматування
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("9. Ціле число у вісімковій системі: %o%n", integer));
        sb.append(String.format("10. Число з плаваючою точкою, вирівняне по центру у полі 15: %15.2f%n", floating));

        // Вивід значень з використанням StringBuilder
        System.out.print(sb.toString());

        scanner.close();
    }
}
