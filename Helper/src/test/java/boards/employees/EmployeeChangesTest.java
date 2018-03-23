package boards.employees;

import boards.places.Board;
import boards.places.Position;
import boards.plan.Plan;
import boards.products.Product;
import org.junit.jupiter.api.Test;

class EmployeeChangesTest {
        //Створення зміни.
        EmployeeChanges ech = new EmployeeChanges('A');

    @Test
    void setEmployees() {

        //Крок1. Працівники.
        System.out.println("----Крок1.----Видрук зміни А----");
        ech.setEmployees(new Employee(12615));
        ech.setEmployees(new Employee(12812));
        ech.setEmployees(new Employee(14122));
        ech.printChanges();
        System.out.println("------------------------------------------------");

        //Крок2. Дошки.
        //TODO: Потрібно створити клас BoardStock і отримувати дошки звідти.
        System.out.println("----Крок2.----Вибір працівника 1-----");
        Board board = new Board(1323);
        Position wp = new Position();
        board.setPositions(wp);
        System.out.println(board.toString());
        System.out.println("------------------------------------------------");

        //Крок3. Створення плану.
        System.out.println("----Крок3. ----Видрук плану позиції----");
        Plan p = new Plan();
        p.createOrders(new Product("MFC1841029A0B"),50, ech);
        p.createOrders(new Product("MFC1841189B0C"), 26, ech);
        System.out.println(p.toString());
        System.out.println("------------------------------------------------");

        //Крок4. Логування.
        System.out.println("----Крок4. ----Логування. Видрук стану позиції----");
        wp.setEmployee(ech.employees.get(0));           //TODO: Перенести логування працівника з позиції в клас боард.
        System.out.println("Залогований працівник: " + ech.employees.get(0).toString());
        System.out.println("------------------------------------------------");

        //Крок5
    }

    @Test
    void printEployees() {
    }
}