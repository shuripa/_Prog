package boards.plan;

import boards.products.Product;

public class Order {
    Product product;
    int count;
    int started;
    int finished;

    public Order(Product product, Integer count) {
        this.product = product;
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


    @Override
    public String toString() {
        return "Order{" +
                "product=" + product +
                ", count=" + count +
                ", started=" + started +
                ", finished=" + finished +
                '}';
    }
}
