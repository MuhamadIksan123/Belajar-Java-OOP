package pzn.application;

import pzn.data.Customer;
import pzn.data.Level;

public class CustomerApp {
    public static void main(String[] Args) {
        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
