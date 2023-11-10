import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
public class DataManager {
    public final List<Product> products;
    public DataManager(List<Product> products){
        this.products = products;
    }

    public List<Product> getBooksFilteredByPrice(int price) {
        return products.stream()
                .filter(p -> p.getType() == Product.Type.BOOK)
                .filter(p -> p.getPrice() > price)
                .collect(Collectors.toList());
    }
    public List<Product> getBooksWithDiscount(int discount) {
        return products.stream()
                .filter(p -> p.getType() == Product.Type.BOOK && p.isDiscount())
                .map(p -> new Product(p.getId(), p.getType(), p.getPrice() - p.getPrice() * 0.01 * discount))
                .collect(Collectors.toList());
    }
    public Product getCheapestBook() {
        return products.stream()
                .filter(p -> p.getType() == Product.Type.BOOK)
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(()-> new NoSuchElementException("Product type "+ Product.Type.BOOK + " was not found"));
    }
    public List<Product> getThreeLastAddedProducts() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getRelease))
                .limit(3)
                .collect(Collectors.toList());
    }
    public double calculateTotalPriceOfBooksCurrentYear(){
        return products.stream()
                .filter(p -> p.getType() == Product.Type.BOOK)
                .filter(p -> (1900 + p.getRelease().getYear()) == LocalDate.now().getYear())
                .map(Product::getPrice)
                .filter(price -> price < 75.0)
                .reduce(Double::sum)
                .orElseThrow(()-> new NoSuchElementException("Can't find any specify book"));
    }
    public Map<Product.Type, List<Product>> getProductsGroupByType(){
        return products.stream().collect(Collectors.groupingBy(Product::getType));
    }
}