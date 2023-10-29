package coffee.order;

public class Order {
    private int numbers;
    private String names;

    public Order(int numbers, String names) {
        this.numbers = numbers;
        this.names = names;
    }

    public int getNumber() {
        return numbers;
    }

    public String getName() {
        return names;
    }
}
