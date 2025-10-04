package session.five.shop;

public class App {
    public static void main(String[] args) {
        Client client = new Client("João", 23324234);

        Order orderOne = new Order();
        Order orderTwo = new Order();

        OrderItem item = new OrderItem();
        OrderItem itemTwo = new OrderItem();

        item.addProduct(new Product("maçã", 3.5, 2));
        item.addProduct(new Product("pera", 1.5, 2));

        itemTwo.addProduct(new Product("cebola", 5.5, 5));
        itemTwo.addProduct(new Product("tomate", 3.5, 4));

        orderOne.addOrderItem(item);
        orderTwo.addOrderItem(itemTwo);

        client.addOrder(orderOne);
        client.addOrder(orderTwo);

        System.err.println(client.computePriceOrder());
    }
}
