package skillklan.module2.homework8;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        CheckPrice values = new CheckPrice();
        HashMap<String, Integer> products = new HashMap(Map.of("Серветки", 10, "Батончик", 11));
        products.put("Сок", -10);
        products.put("Пиво", 20);
        products.put("Масло", 100);
        System.out.println(products);

//        for (Map.Entry<String, Integer> product : products.entrySet()) {
//            String key = product.getKey();
//            Integer value = product.getValue();
//            System.out.println("Товар: " + key + ", ціна: " + value + " грн.");
//
//            try { //NOTE: вийшло тільки тут зробити перевірку, сам себе заплутав
//                values.validatePrice(value);
//                System.out.println("Ціна корректна: " + value);
//            } catch (InvalidPriceException e) {
//                System.out.println("Ціну введено некоректну " + e);
//            } finally {
//                System.out.println("Роботу завершено");
//            }
//        }
    }
}
