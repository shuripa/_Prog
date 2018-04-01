package boards.server;

import boards.products.Product;

import java.util.HashMap;

public class ProductList {
    private static ProductList ourInstance = new ProductList();
    private static int moduleId;
    private static HashMap<Integer, Product> products = new HashMap<>();

    public static ProductList getInstance() {
        return ourInstance;
    }

    private ProductList() {
        moduleId = 0;
    }

    public int getModuleId(String productName, int ordId) {
        moduleId++;
        products.put(moduleId, new Product(productName, moduleId, ordId));
        return moduleId;
    }
}
