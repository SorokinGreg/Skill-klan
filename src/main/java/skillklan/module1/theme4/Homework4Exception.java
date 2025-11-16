package skillklan.module1.theme4;

import java.util.Scanner;

public class Homework4Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть ділене : ");
        int a = in.nextInt();
        System.out.print("Введіть дільник: ");
        int b = in.nextInt();
        zero(a, b);// TODO: Виклик методу zero — ок, але добре передавати результат у змінну
        System.out.println("Кінець программи");
    }

    static void zero(int a, int b) {
        try {
            int result = a / b;// TODO: Цей код правильний, але краще не створювати змінну result — можна одразу виводити
            System.out.println("Результат: " + result);
        } catch (Exception с) {
            // TODO: Ловити Exception — занадто загально.
            // маємо ловити саме ArithmeticException — так правильно!
            System.out.println("На нуль ділити поки що не можна");
        }

        // TODO: Додати finally — щоб попрактикувати завершальні блоки.
        // Наприклад:
        // finally {
        //     System.out.println("Обробка завершена");
        // }
    }
}