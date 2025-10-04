package session.five.onetomany;

public class Item {
    String name;
    int quantity;
    double price;
    Order order;

    Item() {
        this(null, 0, 0.0);
    }

    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
