package skillklan.module1.theme3;//TODO тут все виправив - покажу як це робити на майбутнє

import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int[] numbs = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 15, 21, 25, 15};
        int negative = -1;
        int yourNum = in.nextInt();
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] == yourNum) {
                negative = i;
                break;
            }
        }
        System.out.println(negative);
    }
}
//TODO тут спеціально залишаю без коментарів щоб ти розібрався сам
