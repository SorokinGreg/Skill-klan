package skillklan.module1.theme4;

import java.util.Scanner;

public class Homework4Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть ділене : ");
        int a = in.nextInt();
        System.out.print("Введіть дільник: ");
        int b = in.nextInt();
        zero(a, b);
    }

//    public static void zero(int a, int b) {
//        try {
//            System.out.println("Результат: " + a / b);
//        } catch (ArithmeticException с) {
//            System.out.println("На нуль ділити поки що не можна");
//        } finally {
//            System.out.println("Операція завершена");
//        }
//    }
//}

    public static Integer zero(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат: " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("На нуль ділити не можна: " + e.getMessage());
            return null;
        } finally {
            System.out.println("Операція завершена");
        }
    }
}