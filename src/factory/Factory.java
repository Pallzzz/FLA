package factory;

import product.Clothing;
import product.Electronics;
import product.Furniture;
import product.InterfaceProduct;

public class Factory {
    public static InterfaceProduct createProduct(String type) {
        if (type.equalsIgnoreCase("Electronics")) {
            return new Electronics();
        } else if (type.equalsIgnoreCase("Clothing")) {
            return new Clothing();
        } else if (type.equalsIgnoreCase("Furniture")) {
            return new Furniture();
        }
        return null;
    }
}
