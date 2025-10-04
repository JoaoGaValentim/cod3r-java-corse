package session.five.shop;

public class Product {
    OrderItem orderItem;
    String name;
    double price;
    int quantity;

    Product() {
        this(null, 0.0, 0);
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
