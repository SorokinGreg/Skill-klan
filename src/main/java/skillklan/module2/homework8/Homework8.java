package skillklan.module2.homework8;


import java.util.ArrayList;
import java.util.List;

public class Homework8 {
    public static void main(String[] args) {
//        Product sok = new Product("Сок ТМ Садочок", 30.5, true);
//        Product phone = new Product("Смартфон Google Pixel 10 Pro Fold 16/1TB", 128649.0, true);
//        Product laptop = new Product("Ноутбук Dell Alienware 18 Area-51 Ultra 9", 535075.0, true);
//
//        ArrayList<Product> products = new ArrayList<>();
//        products.add(new Product("Консерва", 10.5, true));
//        products.add(new Product("Коньяк", 100.99, true));
//        products.add(new Product("Підгузки", 111.99, true));
//        for (Product prod : products) {
//            prod.printProductInfo();
//        }


//        sok.printProductInfo();
//        products.get(2).printProductInfo();
//        phone.printProductInfo();
//        laptop.printProductInfo();


        CheckPrice values = new CheckPrice();
        try {
            int price = 8; //я думав що ТУТ треба перевіряти значення value яке в нас в попередній задачі в HashMap і потратив кучу часу на це але не вийшло
            values.validatePrice(price);
            System.out.println("Ціна корректна: " + price);
        } catch (InvalidPriceException e) {
            System.out.println("Ціну введено некоректну " + e);
        } finally {
            System.out.println("Роботу завершено");
        }
    }
}
