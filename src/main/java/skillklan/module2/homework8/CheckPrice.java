package skillklan.module2.homework8;

public class CheckPrice {
    public void validatePrice(int price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Некоректна ціна: " + price);
        }
    }
}
