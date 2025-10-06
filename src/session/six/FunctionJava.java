package session.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionJava {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Arroz", 22, 12, 0.2),
                new Product("Feijão", 24, 14, 0.3),
                new Product("Pizza", 40, 20, 0.1));

        Function<String, Product> getProductByName = name -> {
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(name)) {
                    return product;
                }
            }
            return null;
        };

        Function<Product, Double> computePrice = p -> p == null ? 0.0 : p.getQuantity() * p.getPrice();
        Predicate<Double> isHighPrice = price -> price >= 750 ? true : false;
        Function<Double, Boolean> verifyHighPrice = price -> isHighPrice.test(price);

        var isPizzaHighPrice = getProductByName
                .andThen(computePrice)
                .andThen(verifyHighPrice)
                .apply("pizza");

        System.out.println(isPizzaHighPrice);
    }
}
