package facade;

public class OrderFacade {
	private Inventory inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new Inventory();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String productId, int quantity, String paymentMethod) {
        if (inventoryService.checkStock(productId, quantity)) {
            paymentService.processPayment(paymentMethod);
            shippingService.shipProduct(productId, quantity);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Insufficient stock for product ID: " + productId);
        }
    }
}
