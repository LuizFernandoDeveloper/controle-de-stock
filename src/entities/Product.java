package entities;
public class Product {
    private String name ;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double TotalValueInStock(){
        return price * quantity;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity; 
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return  "Name product: "+ name +", Price of product: $ "+ String.format("%.2f", price) +
                ", Quantities in stack of the product:"+ quantity +", Total value in stock: $"+ String.format("%.2f",TotalValueInStock());
    }
    
}
