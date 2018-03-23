package boards.employees;

import boards.places.Position;
import org.junit.jupiter.api.Test;

class EmployeeChangesTest {
        EmployeeChanges ech = new EmployeeChanges('A');

    @Test
    void setEmployees() {

        //Крок1. Видрук зміни
        System.out.println("----Крок1.----Видрук зміни А----");
        ech.setEmployees(new Employee(12615));
        ech.setEmployees(new Employee(12812));
        ech.setEmployees(new Employee(14122));
        ech.printChanges();
        System.out.println("------------------------------------------------");

        //Шаг2. Выбор работника. Подстветка позиции
        System.out.println("----Крок2.----Вибір працівника 1-----");
        System.out.println("------------------------------------------------");

        //Шаг3. Печать состояния позиции
        System.out.println("----Крок3. ----Логування. Видрук стану позиції----");
        Position wp = new Position();
        wp.setEmployee(ech.employees.get(0));
        System.out.println("Залогований працівник: " + ech.employees.get(0).toString());
        System.out.println("------------------------------------------------");
    }

    @Test
    void printEployees() {
    }
}