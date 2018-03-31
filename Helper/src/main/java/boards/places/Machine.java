package boards.places;

import boards.plan.Order;
import boards.server.IdGen;

import java.util.ArrayList;

public class Machine {
    private String name;
    private ArrayList <Board> boards = new ArrayList<>();
    private ArrayList <Order> orders = new ArrayList<>();

    public Machine(String name) {
        this.name = name;
    }

    public void setBoard(Board board) {
        this.boards.add(board);
    }

    public void setOrder(Order order) {
        this.orders.add(order);
    }

    public void start(int brdId) {
        //Пошук першого замовлення яке підходить для дошки.
        //TODO: отримання дошки
        Board brd = null;
        for (Board b: boards) if (b.getId() == brdId) brd = b;
        //TODO: перевірка умови яке замовлення підходить для даної дошки. Отримання замовлення
        Order ord = orders.get(0);
        //TODO: отримання унікального номеру для модулю
        int UniqNo = IdGen.getInstance().getModuleId();
        //TODO приєднання модулю до дошки
        brd.setAssignned(UniqNo);
        //TODO: реалізувати статистику. Кількість в роботі, кількість зроблених.
        ord.incStarted();

        //TODO: cтворити тест для класу.
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
