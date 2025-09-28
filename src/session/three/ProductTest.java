package session.three;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var smartPhone = new Product();

        smartPhone.name = "Celular";
        smartPhone.price = 3456.66;
        smartPhone.discount = 0.15;

        System.out.println(smartPhone.name);
        System.out.println(smartPhone.price);
        System.out.println(smartPhone.discount);

        var notebook = new Product();

        notebook.name = "Laptop Lenovo";
        notebook.price = 5432.66;
        notebook.discount = 0.16;

        System.out.println(notebook.name);
        System.out.println(notebook.price);
        System.out.println(notebook.discount);

        var smartPhoneNewPrice = smartPhone.calculateNewPriceWithDiscount(0.2);
        var notebookNewPrice = notebook.calculateNewPriceWithDiscount();

        System.out.println(smartPhoneNewPrice);
        System.out.println(notebookNewPrice);

        var cartAverage = (smartPhoneNewPrice + notebookNewPrice) / 2;

        System.out.println("MÉDIA DOS PREÇOS: " + cartAverage);

        sc.close();
    }
}
