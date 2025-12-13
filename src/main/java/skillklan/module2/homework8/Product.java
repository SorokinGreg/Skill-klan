package skillklan.module2.homework8;

class Product {
    private String name;
    private double price;
    private boolean availability;

    Product(String name, double price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Помилка, введіть коректне найменування");
        } else {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Помилка, вказано від’ємну ціну");
        } else {
            this.price = price;
        }
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getAvailability() {
        return this.availability;
    }

    void printProductInfo() {
        System.out.println("Найменування товару: " + name);
        System.out.println("Ціна товару: " + price + " грн.");
        System.out.println("Наявність товару: " + availability);
    }
}
