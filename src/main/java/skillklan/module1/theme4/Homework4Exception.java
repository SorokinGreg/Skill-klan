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
//        int result = zero(a, b);
    }

    public static void zero(int a, int b) {
        try {
            System.out.println("Результат: " + a / b);
        } catch (ArithmeticException с) {
            System.out.println("На нуль ділити поки що не можна");
        } finally {
            System.out.println("Операція завершена");
        }
    }
}