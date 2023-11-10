import java.util.Date;

public class Product {
    private final String id;
    private final Type type;
    private final Double price;
    private boolean discount;
    private final Date release;
    public Product(String id, Type type, double price){
        this.id = id;
        this.type = type;
        this.price = price;
        this.release = new Date();
    }
    public String getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public Date getRelease() {
        return release;
    }

    @Override
    public String toString() {
        return "type: " + type + ", price:" + price + ", discount" + discount + ", release date" + release + "\n";
    }

    public enum Type{
            BOOK
    }
}
