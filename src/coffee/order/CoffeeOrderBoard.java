package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orderQueue;

    public CoffeeOrderBoard() {
        orderQueue = new ArrayList<>();
    }

    public void add(String customerName) {
        Order newOrder = new Order(customerName);
        orderQueue.add(newOrder);
    }

    public void deliver() {
        if (!orderQueue.isEmpty()) {
            Order nextOrder = orderQueue.remove(0);
            System.out.println("Delivering order: " + nextOrder.getCustomerName());
        } else {
            System.out.println("No orders in the queue.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orderQueue.size(); i++) {
            Order order = orderQueue.get(i);
            if (order.getOrderNumber() == orderNumber) {
                System.out.println("Delivering order: " + order.getCustomerName());
                orderQueue.remove(i);
                return;
            }
        }
        System.out.println("Order with number " + orderNumber + " wasn't found in the queue.");
    }

    public void draw() {
        if (orderQueue.isEmpty()) {
            System.out.println("No orders in the queue.");
        } else {
            System.out.println("=================");
            System.out.println("Num | Name");
            for (Order order : orderQueue) {
                System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
            }
        }
    }
}