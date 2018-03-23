package boards.plan;

import java.util.ArrayList;

public class OrdersStock {

    ArrayList<Order> orders = new ArrayList<>();

    public void setOrders(Order order) {
        orders.add(order);
    }
}
