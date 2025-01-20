package pzn.application;

import pzn.data.*;

public class Application {
    public static void main(String[] Args) {
        Product product = new Product("Mac Book Pro", 3000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
