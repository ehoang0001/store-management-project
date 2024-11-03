public class Product {
    private String name;
    private double price;
    private String color;

    // No-argument constructor
    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
        this.color = "Unknown";
    }

    // Parameterized constructor
    public Product(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    // Accessor (getter) and mutator (setter) methods
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to display product information
    @Override
    public String toString() {
        return "Product Name: " + name + ", Price: $" + price + ", Color: " + color;
    }
}
