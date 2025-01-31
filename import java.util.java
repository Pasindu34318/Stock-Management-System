import java.util.List;

public interface StockManagement {
    void addProduct(String productId, String name, int quantity, double price);
    void removeProduct(String productId);
    void updateStock(String productId, int quantity);
    void updatePrice(String productId, double newPrice);
    int checkStock(String productId);
    double getProductPrice(String productId);
    List<String> listProducts();
}