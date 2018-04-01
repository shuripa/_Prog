package boards.plan;

import boards.products.Product;

public class Order {
//    Product product;
    String productName;
    double etalonTime;
    int count;
    int started;
    int finished;

//    public Order(Product product, Integer count) {
////        this.product = product;
//        this.count = count;
//        this.started = 0;
//        this.finished = 0;
//    }

    public Order(String productName, Integer count, double etalonTime) {
        this.productName = productName;
        this.etalonTime = etalonTime;
        this.count = count;
        this.started = 0;
        this.finished = 0;
    }

    public int getStarted() {
        return started;
    }

    public void incStarted() {
        started++;
    }

    public int getFinished() {
        return finished;
    }

    public void incFinished() {
        finished++;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", etalonTime=" + etalonTime +
                ", count=" + count +
                ", started=" + started +
                ", finished=" + finished +
                '}';
    }
}
