package session.five.shop;

import java.util.ArrayList;

public class Client {
    final String name;
    final int credCardNumber;
    final ArrayList<Order> orders = new ArrayList<>();

    Client() {
        this(null, 0);
    }

    Client(String name, int credCardNumber) {
        this.name = name;
        this.credCardNumber = credCardNumber;
    }

    void addOrder(Order order) {
        this.orders.add(order);
        order.client = this;
    }

    ArrayList<Order> getOrders() {
        return orders;
    }

    double computePriceOrder() {
        double total = 0.0;

        for (Order order : getOrders()) {
            total += order.calculateOrder();
        }

        return total;
    }
}
