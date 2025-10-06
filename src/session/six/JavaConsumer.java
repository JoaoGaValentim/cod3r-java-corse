package session.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaConsumer {
    public static void main(String[] args) {
        Consumer<Product> showProductData = product -> {
            System.out.println(product);
        };

        List<Product> products = Arrays.asList(
                new Product("Arroz", 22, 12, 0.2),
                new Product("Feijão", 24, 14, 0.3),
                new Product("Pizza", 33, 20, 0.1));

        products.forEach(showProductData);
    }
}
