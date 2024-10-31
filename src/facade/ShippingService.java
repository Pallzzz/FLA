package facade;

public class ShippingService {
    public void shipProduct(String productId, int quantity) {
        // Ship product
        System.out.println("Product shipped. Product ID: " + productId + ", Quantity: " + quantity);
    }
}
