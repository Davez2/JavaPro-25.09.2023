import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add("Alice");
        board.add("Bob");
        board.add("Charlie");
        board.draw();
        Order order = board.deliverNumber(3);
        System.out.println(order.getName());

        board.draw();

    }
}