package session.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierJava {
    public static void main(String[] args) {
        // supplier não tem input, só retorno
        Supplier<List<Product>> productList = () -> Arrays.asList(
                new Product("Maçã", 10, 20, 0),
                new Product("Banana", 1, 0.5, 10),
                new Product("Laranja", 2, 0.7, 20),
                new Product("Pera", 3, 0.8, 15),
                new Product("Uva", 4, 1.2, 25),
                new Product("Melancia", 5, 3.5, 5),
                new Product("Abacaxi", 6, 2.0, 8),
                new Product("Morango", 7, 2.5, 12),
                new Product("Kiwi", 8, 1.8, 7),
                new Product("Limão", 9, 0.6, 18),
                new Product("Coco", 10, 4.0, 3),
                new Product("Manga", 11, 1.5, 9),
                new Product("Goiaba", 12, 1.0, 11));

        System.out.println(productList.get());
    }
}
