package main;

import java.util.ArrayList;
import java.util.List;

import facade.OrderFacade;
import factory.Factory;
import observer.ProductSubject;
import observer.ShoppingCart;
import product.InterfaceProduct;
import singleton.DatabaseConnection;

public class Main {

	public Main() {
		
        // database connection
        DatabaseConnection connection = DatabaseConnection.getInstance();
        System.out.println(connection.getData());
		
		// Create products using the factory
        InterfaceProduct electronics = Factory.createProduct("Electronics");
        InterfaceProduct clothing = Factory.createProduct("Clothing");
        // InterfaceProduct furniture = Factory.createProduct("Furniture");

        // Simpan produk ke dalam list (simulasi penyimpanan database)
        List<InterfaceProduct> products = new ArrayList<>();
        products.add(electronics);
        products.add(clothing);
        
        // Display produk dari list
        for (InterfaceProduct product : products) {
            product.displayInfo();
        }
        
        // Create a shopping cart and add products
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(electronics);
        shoppingCart.addProduct(clothing);

        // Buat subject produk dan tambahkan keranjang belanja sebagai observer
        ProductSubject productSubject = new ProductSubject();
        productSubject.addObserver(shoppingCart);

        // Notify observers (shopping cart) about updates
        productSubject.notifyObservers();

        // Place order using the facade
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("E001", 2, "Credit Card");
        orderFacade.placeOrder("C001", 1, "PayPal");
    
	}

	public static void main(String[] args) {
		new Main();
	}

}
