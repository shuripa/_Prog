package boards.plan;

import boards.products.Product;

public class Order {

    private int ordId = 0;
    private String productName;
    private double etalonTime;
    private int count;
    private int started;
    private int finished;

    //TODO: etalonTime має братись з мастерДати
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

    public void starting() {
        started++;
    }

    public int getFinished() {
        return finished;
    }

    public void finishing() {
        finished++;
    }

    public String getProductName() {
        return productName;
    }

    public int getOrdId() {
        return ordId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", etalonTime=" + etalonTime +
                ", count=" + count +
                ", starting=" + started +
                ", finishing=" + finished +
                '}';
    }
}
