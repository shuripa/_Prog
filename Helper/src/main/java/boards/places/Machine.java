package boards.places;

import boards.plan.Order;

import java.util.ArrayList;

public class Machine {
    String name;
    ArrayList <Board> boards = new ArrayList<>();
    ArrayList <Order> orders = new ArrayList<>();

    public Machine(String name) {
        this.name = name;
    }

    public void setBoard(Board board) {
        this.boards.add(board);
    }

    public void setOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", boards=" + boards +
                ", orders=" + orders +
                '}';
    }
}
