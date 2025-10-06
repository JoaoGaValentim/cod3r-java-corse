package session.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaConsumer {
    public static void main(String[] args) {
        Consumer<Product> showProductData = product -> {
            var fields = product.getClass().getDeclaredFields();

            System.out.println();
            System.out.println("Product(");
            System.out.printf("\s%s => %s \n", fields[0].getName(), product.getName());
            System.out.printf("\s%s => %s \n", fields[1].getName(), product.getQuantity());
            System.out.printf("\s%s => %.2f \n", fields[2].getName(), product.getPrice());
            System.out.printf("\s%s => %f \n", fields[3].getName(), product.getDiscount());
            System.out.println(")");
            System.out.println();
        };

        List<Product> products = Arrays.asList(
                new Product("Arroz", 22, 12, 0.2),
                new Product("Feijão", 24, 14, 0.3),
                new Product("Pizza", 33, 20, 0.1));

        products.forEach(showProductData);
    }
}
