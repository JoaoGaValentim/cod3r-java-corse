package session.five.shop;

import java.util.ArrayList;

public class Order {
    int orderId;
    Client client;
    ArrayList<OrderItem> orderItems = new ArrayList<>();

    void addOrderItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        orderItem.order = this;
    }

    double calculateOrder() {
        double total = 0.0;

        for (OrderItem order : orderItems) {
            for (Product product : order.getProducts()) {
                total += product.price * product.quantity;
            }
        }

        return total;
    }
}
