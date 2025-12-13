package skillklan.module2.homework8;

import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
//        HashSet<String> categories = new HashSet<>();
        HashSet<String> categories = new HashSet<>(List.of("електроніка", "одяг", "побутова техніка"));
        categories.add("алкоголні напої");
        categories.add("електроніка");
//        categories.add("ЕЛЕКТРОНІКА");
//        categories.add("Електроніка");
//        categories.add("ЕлектронікА"); //виходить що регістр впливає на ідентичність. а треба робити якесь правило щоб це так не було?
        categories.add("авто і мото");
        System.out.println(categories);
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть категорію товару: ");
        String yourcategory = in.nextLine();
//        System.out.println(categories);

//        for (String category : categories) {
//            if (category.equals(yourcategory.toLowerCase())) {
//                System.out.println("Вибрана категорія: " + category);
////                break;
//            } else {
//                System.out.println("Такої категорії немає");
////                break;
//            }
//        }

        if (categories.contains(yourcategory.toLowerCase())) {
            for (String category : categories) {
                if (category.equals(yourcategory.toLowerCase())) {
                    System.out.println("Вибрана категорія: " + category);
                    break;
                }
            }
        } else {
            System.out.println("Такої категорії немає");
        }
    }
}
