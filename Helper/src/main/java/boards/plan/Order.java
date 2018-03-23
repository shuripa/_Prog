package boards.plan;

import boards.modules.Product;

public class Order {
    Product product;
    Integer count;

    public Order(Product product, Integer count) {
        this.product = product;
        this.count = count;
    }

    @Override
    public String toString() {
        return "" + product + ": " + count;
    }
}
