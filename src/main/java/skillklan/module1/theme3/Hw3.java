package skillklan.module1.theme3;

import java.util.Scanner;

public class Hw3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть ваш вік: ");
        int minAge = 18, userAge = in.nextInt();

        if (userAge >= minAge) {//TODO в умові сказано від 18 і більше, а у тебе тут якщо 18 то буде доступ заборонено - виправити
            System.out.println("Доступ дозволено");
        } else {
            System.out.println("Доступ заборонено");
        }
    }
}
