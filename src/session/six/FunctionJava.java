package session.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionJava {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Arroz", 22, 12, 0.2),
                new Product("Feijão", 24, 14, 0.3),
                new Product("Pizza", 33, 20, 0.1));

        Function<String, Product> getProductName = name -> {
            for (Product product : products) {
                if (product.getName() == name) {
                    return product;
                }
            }
            return null;
        };

        Product product = getProductName.apply("Pizza");

        if (!product.equals(null)) {
            System.out.println(product);
        }
    }
}
