package observer;

import java.util.ArrayList;
import java.util.List;

import product.InterfaceProduct;

public class ShoppingCart implements Observer {
    private List<InterfaceProduct> products = new ArrayList<>();

    public void addProduct(InterfaceProduct product) {
        products.add(product);
        update();
    }
	@Override
	public void update() {
		System.out.println("Shopping Cart Updated. Total items: " + products.size());		
	}
}
