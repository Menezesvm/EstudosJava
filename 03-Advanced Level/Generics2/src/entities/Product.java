package entities;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;

   public Product(String name, double price){
       this.name=name;
       this.price=price;
   }
   public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
       return this.price.compareTo(other.price);
    }
    @Override
    public String toString() {
       return name + " - R$ " + String.format("%.2f", price);
    }
}
