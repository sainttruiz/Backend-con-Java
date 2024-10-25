package Lambda.Project;
import java.util.List;
import java.util.stream.Collectors;

public class Product{
    private String name;
    private String category;
    private double price;
    private double rate;

    public Product(){
        
    }

    public Product(String name, String category, double price, double rate){
        this.name=name;
        this.category=category;
        this.price=price;
        this.rate=rate;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getRate(){
        return this.rate;
    }
    public void setRate(double rate){
        this.rate=rate;
    }

    @Override
    public String toString(){
        return this.name + " - " + this.category + " -$" + this.price + " - Rating: " + this.rate;
    }

    public List<Product> filterByProduct(List<Product> products, String name, String category, Double price, Double rate) {
        return products.stream()
                .filter(product -> name == null || product.getName().equalsIgnoreCase(name))
                .filter(product -> category == null || product.getCategory().equalsIgnoreCase(category))
                .filter(product -> price == null || product.getPrice() <= price)
                .filter(product -> rate == null || product.getRate() >= rate)
                .collect(Collectors.toList());
    }
}
