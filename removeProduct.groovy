import java.util.*;

public class StockManager implements StockManagement {
    private Map<String, Product> stock = new HashMap<>();

    public void addProduct(String productId, String name, int quantity, double price) {
        if (!stock.containsKey(productId)) {
            stock.put(productId, new Product(productId, name, quantity, price));
            System.out.println("Product added: " + name);
        } else {
            System.out.println("Product ID already exists!");
        }
    }

    public void removeProduct(String productId) {
        if (stock.remove(productId) != null) {
            System.out.println("Product removed: " + productId);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void updateStock(String productId, int quantity) {
        Product product = stock.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            System.out.println("Stock updated for: " + product.getName());
        } else {
            System.out.println("Product not found!");
        }
    }

    public void updatePrice(String productId, double newPrice) {
        Product product = stock.get(productId);
        if (product != null) {
            product.setPrice(newPrice);
            System.out.println("Price updated for: " + product.getName());
        } else {
            System.out.println("Product not found!");
        }
    }

    public int checkStock(String productId) {
        Product product = stock.get(productId);
        return (product != null) ? product.getQuantity() : -1;
    }

    public double getProductPrice(String productId) {
        Product product = stock.get(productId);
        return (product != null) ? product.getPrice() : -1;
    }

    public List<String> listProducts() {
        List<String> products = new ArrayList<>();
        for (Product p : stock.values()) {
            products.add(p.getName() + " (ID: " + p.getProductId() + ")");
        }
        return products;
    }
}