package skillklan.module2.homework7;

public class Homework1 {
    public static void main(String[] args) {
        Product product = new Product("Сок ТМ Садочок", 30.5, true);
        Product phone = new Product("Смартфон Google Pixel 10 Pro Fold 16/1TB", 128649.0, true);
        Product laptop = new Product("Ноутбук Dell Alienware 18 Area-51 Ultra 9", 535075.0, true);
        DiscountedProduct laptopDiscount = new DiscountedProduct("Ноутбук Dell Alienware 18 Area-51 Ultra 9", 535075.0, true, 10);
        User user1 = new Admin();
        User user2 = new Customer();
//        user1.getRole();
//        user2.getRole();
        check(user1);
        check(user2);
//        product.setPrice(12.5);
//        product.printProductInfo();
//        phone.printProductInfo();
//        laptop.printProductInfo();
//        laptopDiscount.discountPrice();
    }

    /// / а на цьому я застряг:
    static public void check(User user) {
        if (user instanceof Admin) {
            System.out.println("Метод в абстрактному класі: " + user.getClass().getSimpleName());
        } else if (user instanceof Customer) {
            System.out.println("Метод в абстрактному класі: " + user.getClass().getSimpleName());
        }
    }
}

