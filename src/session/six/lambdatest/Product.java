package session.six.lambdatest;

public class Product {
    private final String name;
    private final int quantity;
    private final double price;
    private final double discount;

    public Product(String name, int quantity, double price, double discount) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        String content = """
                Product {
                    name => %s
                    Qtd => %s
                    price => %.2f
                    discount => %s%%
                }
                """;
        return String.format(content, this.name,
                this.quantity,
                this.price,
                this.discount);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
}
