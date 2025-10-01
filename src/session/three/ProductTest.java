package session.three;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product.discount = 0.3;

        var smartPhone = new Product("Smartphone", 3455.22);
        var notebook = new Product("Laptop Lenovo", 5432.65);

        var smartPhoneNewPrice = smartPhone.calculateNewPriceWithDiscount(0.22);
        var notebookNewPrice = notebook.calculateNewPriceWithDiscount();

        smartPhone.printProduct();
        notebook.printProduct();

        System.out.println(smartPhoneNewPrice);
        System.out.println(notebookNewPrice);

        var cartAverage = (smartPhoneNewPrice + notebookNewPrice) / 2;

        System.out.println("MÉDIA DOS PREÇOS: " + cartAverage);

        sc.close();
    }
}
