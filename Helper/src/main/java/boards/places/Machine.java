package boards.places;

/*
* Ціль машини:
* - відображення всіх замовлень;
* - вибір замовленя;
* - старт продукту;
* - фінішування продукту;
*/

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
        //Отримання дошки.
        System.out.println("Отримання дошки");
        Board brd = null;
        for (Board b: boards) if (b.getBoardId() == brdId) brd = b;

        //Пошук першого замовлення яке підходить для дошки.

        System.out.println("Перевірка умов");
        //TODO:Заглушка. Перевірка умови яке замовлення підходить для даної дошки. Отримання замовлення.
        Order ord = null;
        for (Order o: orders) {
            if (brd.isValid(o.getProductName())){
                ord = o;
                break;
            }
        }

        System.out.println("Створення продукту");
        //Створення продукту. Отримання унікального номеру для модулю
        int UniqNo = ProductList.getInstance().getModuleId(ord.getProductName(), ord.getOrdId());

        System.out.println("Зміна статистики");
        //Реалізувати статистику. Кількість в роботі, кількість зроблених.
        ord.starting(); //TODO: чи правильно що машина керує статистикою замовлення? чи немає для цього більш правильного місця?

        System.out.println("Приєднання модулю");
        //TODO приєднання модулю до дошки
        brd.setAssignned(UniqNo);

        System.out.println("Створення обєкту продукту");
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
