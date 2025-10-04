package session.five.onetomany;

import java.util.ArrayList;

public class Order {
    String clientName;
    ArrayList<Item> items = new ArrayList<>();

    void addItem(String name, int quantity, double price) {
        insertItem(new Item(name, quantity, price));
    }

    void insertItem(Item item) {
        items.add(item);
        item.order = this;
    }

    double calculateOrderPrice() {
        double total = 0.0;

        for (Item item : items) {
            total += item.price * item.quantity;
        }

        return total;
    }
}
