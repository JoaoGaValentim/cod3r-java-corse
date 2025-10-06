package session.six;

import java.util.function.Predicate;

public class JavaPredicate {
    public static void main(String[] args) {
        Predicate<Product> isHighPrice = (
                product) -> product.getPrice() - (product.getPrice() * product.getDiscount()) >= 750 ? true : false;

        Product product = new Product("Celular", 120, 1200, 0.2);
        System.out.println(isHighPrice.test(product));
    }
}
