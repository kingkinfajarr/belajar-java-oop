package kingkinfajarr.application;

import kingkinfajarr.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Lenovo", 5_000_000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
