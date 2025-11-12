package skillklan.module1.theme3;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть день: ");
        String day = in.nextLine();
        day = day.toLowerCase();
        switch (day) {
            case "понеділок", "вівторок", "середа", "четвер", "п’ятниця":
                System.out.println("Будень");
                break;
            case "субота", "неділя":
                System.out.println("Вихідний");
                break;
            default:
                System.out.println("Перевірте правильність написання. Такого дня не існує");
        }

    }
}
