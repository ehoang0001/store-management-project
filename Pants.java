public class Pants extends Product {
    private int waistSize;
    private int length;

    // No-argument constructor
    public Pants() {
        super();
        this.waistSize = 0;
        this.length = 0;
    }

    // Parameterized constructor
    public Pants(String name, double price, String color, int waistSize, int length) {
        super(name, price, color);
        this.waistSize = waistSize;
        this.length = length;
    }

    // Accessor and mutator methods for waistSize and length
    public int getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(int waistSize) {
        this.waistSize = waistSize;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // toString method to include superclass and subclass details
    @Override
    public String toString() {
        return super.toString() + ", Waist Size: " + waistSize + ", Length: " + length;
    }
}
