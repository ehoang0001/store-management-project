public class Jacket extends Product {
    private String material;
    private boolean isWaterproof;

    // No-argument constructor
    public Jacket() {
        super();
        this.material = "Unknown";
        this.isWaterproof = false;
    }

    // Parameterized constructor
    public Jacket(String name, double price, String color, String material, boolean isWaterproof) {
        super(name, price, color);
        this.material = material;
        this.isWaterproof = isWaterproof;
    }

    // Accessor and mutator methods for material and isWaterproof
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean getIsWaterproof() {
        return isWaterproof;
    }

    public void setIsWaterproof(boolean isWaterproof) {
        this.isWaterproof = isWaterproof;
    }

    // toString method to include superclass and subclass details
    @Override
    public String toString() {
        return super.toString() + ", Material: " + material + ", Waterproof: " + isWaterproof;
    }
}
