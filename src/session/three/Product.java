package session.three;

public class Product {
    String name;
    double price;
    double discount;

    /***
     * <h4>calculateNewPriceWithDiscount</h4>
     * <p>
     * This method calculate a new price with discount in percentage.
     * 
     * @since 1.0
     * @see #calculateNewPriceWithDiscount()
     * @return price - (price * discount)
     */
    double calculateNewPriceWithDiscount() {
        return price - (price * discount);
    }

    /***
     * <h4>calculateNewPriceWithDiscount</h4>
     * <p>
     * This method calculate a new price with discount in percentage.
     * 
     * @param managerDiscount
     * @see #calculateNewPriceWithDiscount(double)
     * @return price - (price * (managerDiscount + discount))
     */
    double calculateNewPriceWithDiscount(double managerDiscount) {
        return price - (price * (managerDiscount + discount));
    }
}
