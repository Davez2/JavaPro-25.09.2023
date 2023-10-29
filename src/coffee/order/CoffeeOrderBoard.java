package coffee.order;
import java.util.ArrayList;

public class CoffeeOrderBoard {
    private ArrayList<Order> orders;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        nextOrderNumber = 1;
    }

    public void add(String name) {
        Order order = new Order(nextOrderNumber, name);
        orders.add(order);
        nextOrderNumber++;
    }

    public Order deliver() {
        return orders.remove(0);
    }

    public Order deliverNumber(int orderNumber) {
        for (Order order : orders) {
            if (order.getNumber() == orderNumber) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}