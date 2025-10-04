package session.five.onetomany;

public class OneToManyTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.clientName = "João";

        order.addItem("caneta", 10, 1.5);
        order.addItem("lapis", 20, 1);
        order.addItem("caderno", 2, 62);
        order.addItem("borracha", 2, 0.5);

        // example bi relational relationship
        System.out.println(order.calculateOrderPrice());
        System.out.println(order.items.get(0).order.calculateOrderPrice());
    }
}
