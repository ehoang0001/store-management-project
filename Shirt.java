public class Shirt extends Product {
    private String size;
    private boolean isLongSleeve;

    // No-argument constructor
    public Shirt() {
        super();
        this.size = "Unknown";
        this.isLongSleeve = false;
    }

    // Parameterized constructor
    public Shirt(String name, double price, String color, String size, boolean isLongSleeve) {
        super(name, price, color);
        this.size = size;
        this.isLongSleeve = isLongSleeve;
    }

    // Accessor and mutator methods for size and isLongSleeve
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean getIsLongSleeve() {
        return isLongSleeve;
    }

    public void setIsLongSleeve(boolean isLongSleeve) {
        this.isLongSleeve = isLongSleeve;
    }

    // toString method to include superclass and subclass details
    @Override
    public String toString() {
        return super.toString() + ", Size: " + size + ", Long Sleeve: " + isLongSleeve;
    }
}
