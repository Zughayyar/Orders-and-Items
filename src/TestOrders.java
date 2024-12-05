import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "mocha";
        item2.name = "latte";
        item3.name = "drip coffee";
        item4.name = "cappuccino";

        item1.price = 2.3;
        item2.price = 3.3;
        item3.price = 4.3;
        item4.price = 5.3;


        // Order variables
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";


        // Print the order1 variable to the console to see what happens.
        System.out.printf("Order Name: %s\n", order1.name);

        // Predict what will happen if you print order1.total.
        System.out.println("Order 1 Total: " + order1.total); // Prints 0.0 since no items are added.

        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.printf("Order 2 Items: %s, Total: %.2f\n", order2.items.get(0).name, order2.total);

        // Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.printf("Order 3 Items: %s, Total: %.2f\n", order3.items.get(0).name, order3.total);

        // Sam added a latte. Update the order accordingly.
        order4.items.add(item2);
        order4.total += item2.price;
        System.out.printf("Order 4 Items: %s, Total: %.2f\n", order4.items.get(0).name, order4.total);

        // Cindhuri's order is now ready. Update her status.
        order1.ready = true;
        System.out.printf("Order 1 for %s is ready: %b\n", order1.name, order1.ready);

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;
        System.out.printf("Order 4 Updated Total: %.2f\n", order4.total);

        // Jimmy's order is now ready. Update his status.
        order2.ready = true;
        System.out.printf("Order 2 for %s is ready: %b\n", order2.name, order2.ready);


    }
}
