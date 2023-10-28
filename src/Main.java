import coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Allen");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Obi-wan");
        coffeeOrderBoard.add("John Snow");

        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver(33);
        coffeeOrderBoard.draw();
    }
}