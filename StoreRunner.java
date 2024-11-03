public class StoreRunner {
    public static void main(String[] args) {
        // Create instances of each product type
        Shirt shirt = new Shirt("Vintage Tee", 15.99, "Blue", "M", true);
        Pants pants = new Pants("Denim Jeans", 25.50, "Black", 32, 34);
        Jacket jacket = new Jacket("Leather Jacket", 75.00, "Brown", "Leather", true);

        // Display product information
        System.out.println(shirt);
        System.out.println(pants);
        System.out.println(jacket);
    }
}
