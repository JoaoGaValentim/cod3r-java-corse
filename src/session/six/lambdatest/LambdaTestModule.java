package session.six.lambdatest;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaTestModule {
    public static void main(String[] args) {
        Product product = new Product("laptop", 1, 3235.89, 0.13);

        Function<Product, Double> calculateDiscount = p -> p.getPrice() * (1 - p.getDiscount());
        Function<Double, Double> getMunicipalImpost = price -> price >= 2500 ? price * 1.085 : price;
        Function<Double, Double> calculateFret = price -> price >= 3000 ? price + 100 : price + 50;
        Function<Double, String> roundDecimalHouses = price -> String.format("%.2f", price);
        UnaryOperator<String> getFormatted = price -> String.format("R$ %s", price);

        var response = calculateDiscount.andThen(getMunicipalImpost)
                .andThen(calculateFret)
                .andThen(roundDecimalHouses)
                .andThen(getFormatted)
                .apply(product);

        System.out.println(response);
    }
}
