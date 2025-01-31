public class Main {
    public static void main(String[] args) {
        StockManager manager = new StockManager();

        manager.addProduct("P001", "Laptop", 10, 1000.0);
        manager.addProduct("P002", "Phone", 20, 500.0);

        System.out.println("Stock of Laptop: " + manager.checkStock("P001"));
        manager.updateStock("P001", 15);
        System.out.println("Updated Stock of Laptop: " + manager.checkStock("P001"));

        System.out.println("Product List: " + manager.listProducts());

        manager.removeProduct("P002");
        System.out.println("Product List after removal: " + manager.listProducts());
    }
}