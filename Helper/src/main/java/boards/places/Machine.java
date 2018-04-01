package boards.places;

import boards.plan.Order;
import boards.products.Product;
import boards.server.ProductList;

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
        for (Board b: boards) if (b.getBoardId() == brdId) brd = b;
        //TODO: перевірка умови яке замовлення підходить для даної дошки. Отримання замовлення
        Order ord = orders.get(0);
        //TODO: реалізувати статистику. Кількість в роботі, кількість зроблених.
        ord.incStarted();
        //TODO: отримання унікального номеру для модулю
        int UniqNo = ProductList.getInstance().getModuleId(ord.getProductName(), ord.getOrdId());
        //TODO приєднання модулю до дошки
        brd.setAssignned(UniqNo);
        //TODO: Створення продукту.
        Product p = new Product(ord.getProductName(), UniqNo, ord);
        //TODO: Приєднання продукту до дошки. Поки не зрозуміло як правильно.
//        brd.setProduct(p);
        //TODO: cтворити тест для класу.
    }

    public void finish(int productId) {
        //TODO Реалізувати фінішування
        //TODO: Визначити дошку на якій знаходиться продукт.
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
