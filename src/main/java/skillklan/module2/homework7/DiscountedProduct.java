package skillklan.module2.homework7;

class DiscountedProduct extends Product {
    private double discount;

    DiscountedProduct(String name, double price, boolean availability, double discount) {
        super(name, price, availability);
        this.discount = discount;
    }

    void discountPrice() {
        double discountPrice = getPrice() - (getPrice() * discount / 100);
        System.out.println("Ціна з урахуванням знижки в " + discount + "%: " + discountPrice);
    }
}