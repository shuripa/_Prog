package boards.plan;

import boards.employees.EmployeeChanges;
import boards.employees.SkillsEmployee;
import boards.products.Product;

import java.util.ArrayList;

public class Plan {

    ArrayList<Order> orders = new ArrayList<>();

    //TODO: Такий самий має бути але не зі зміною а з крайнім терміном 15:00:00

    public void createOrders(Product product, int count, EmployeeChanges ech){
        orders.add(new Order(product.getName(), count, 3.75));
    }

    public Order getOrders(SkillsEmployee skillsEmployee){
        //Заглушка. В подальшому реалізувати отримання замовлення на підставі скіла.
        return orders.get(0);
    }

    @Override
    public String toString() {
        return "Plan{" +
                "orders=" + orders +
                '}';
    }

    public Order getOrder(int i) {
        return orders.get(0);
        //TODO: Замовлення буде вибиратись зі списку. Наразі невідомо який параметр буде передаватись. Можливо потрібен буде не ArrayList а Map.
    }
}
