package session.five.shop;

import java.util.ArrayList;

public class OrderItem {
    Order order;
    Product product;
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
        product.orderItem = this;
    }

    ArrayList<Product> getProducts() {
        return products;
    }
}
