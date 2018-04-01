package boards.plan;

import boards.products.Product;

public class Order {

    //    Product product;
    private int ordId = 0;
    private String productName;
    private double etalonTime;
    private int count;
    private int started;
    private int finished;

//    public Order(Product product, Integer count) {
////        this.product = product;
//        this.count = count;
//        this.started = 0;
//        this.finished = 0;
//    }

    public Order(String productName, Integer count, double etalonTime, int ordId) {
        this.productName = productName;
        this.etalonTime = etalonTime;
        this.ordId = ordId;
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

    public int getOrdId() {
        return ordId;
    }
}
