package boards.employees;

import boards.places.Board;
import boards.places.Machine;
import boards.places.Position;
import boards.plan.Plan;
import boards.products.Product;
import boards.server.IdGen;
import org.junit.jupiter.api.Test;

class EmployeeChangesTest {
        //Створення зміни.
        EmployeeChanges empch = new EmployeeChanges('A');
        IdGen idGen = IdGen.getInstance();
        Plan p = new Plan();
        //TODO: Створити робочий календар для змін

    @Test
    void setEmployees() {

        createEmployee();               //Крок10. Працівники.
        Board board = createBoard();    //Крок20. Дошки.
        createPlan();                   //Крок30. Створення плану.

        //Крок33 Створення Машини
        System.out.println("----Крок33 ----створення машини----");
        Machine machine = new Machine("MB-01");
        machine.setBoard(board);
        System.out.println(machine.toString());
        System.out.println("------------------------------------------------");
        System.out.println();

        //Крок35 Закидання плану на машину.
        System.out.println("----Крок35 ----Закидання плану на машину----");
        machine.setOrder(p.getOrder(0)); //TODO: На самом деле должен выбираться конкретный заказ из плана и закидываться на машину. Пока это 0-заказ из массива.
        System.out.println(machine.toString());
        System.out.println("------------------------------------------------");
        System.out.println();

        //Крок40. Логування.
        System.out.println("----Крок40. ----Логування. Видрук стану позиції----");

        board.getPosition(0).setEmployeeStated(empch.employees.get(0));              //TODO: Перенести логування працівника з позиції в клас Machine.
        System.out.println("Залогований працівник: " + empch.employees.get(0).toString());  //TODO: Заглушка. Виправити.
        System.out.println(machine.toString());
        System.out.println("------------------------------------------------");
        System.out.println();


        //Крок50.1. Стартування.
        System.out.println("----Крок50.1. ----Стартування. Видрук плану позиції. Видрук унікального номеру.----");
        int id = idGen.getModuleId();
        //TODO: функція старту для дошки. Номер дошки передається ззовні.
        machine.start(board.getId());
        //TODO: створення модулю.

        System.out.println("Унікальний номер модулю: " + machine.toString());
        System.out.println("------------------------------------------------");

        //Крок60.1. Формування.
        System.out.println("----Крок6.1. ----Формування.----");
        int timeForm = (int)(Math.random()*10);
        System.out.println("Час формування = " + timeForm);
        System.out.println("------------------------------------------------");

        //Крок70.1. Фінішування.
        System.out.println("----Крок7.1. ----Фінішування.----");
        System.out.println("------------------------------------------------");

        //Крок50.2. Стартування.
        System.out.println("----Крок5.2. ----Стартування. Видрук плану позиції. Видрук унікального номеру.----");
            System.out.println("Номер модулю: " + idGen.getModuleId());
        System.out.println("------------------------------------------------");

        //Крок60.2. Формування.
        System.out.println("----Крок6.2. ----Формування.----");
        System.out.println("------------------------------------------------");

        //Крок70.2. Фінішування.
        System.out.println("----Крок7.2. ----Фінішування.----");
        System.out.println("------------------------------------------------");

        //Крок80. Вилоговування.
        System.out.println("----Крок8. ----Вилоговування.----");
        System.out.println("------------------------------------------------");

    }

    private void createEmployee() {
        //Крок10. Працівники.
        System.out.println("----Крок10.----Видрук працівників зміни А----");
        empch.setEmployees(new Employee(12615));
        empch.setEmployees(new Employee(12812));
        empch.setEmployees(new Employee(14122));
        empch.printChanges();
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    private Board createBoard() {
        //Крок20. Дошки.
        //TODO: Потрібно створити клас BoardStock і отримувати дошки звідти.
        System.out.println("----Крок20.----Створення дошки і позиції-----");
        Board board = new Board(1323);
        Position wp = new Position();
        board.setPositions(wp);
        System.out.println(board.toString());
        System.out.println("------------------------------------------------");
        System.out.println();
        return board;
    }

    private void createPlan() {
        //Крок30. Створення плану.
        System.out.println("----Крок30. ----Створення плану. Видрук плану.----");
        p.createOrders(new Product("MFC1841029A0B"),6, empch);
        p.createOrders(new Product("MFC1841189B0C"), 26, empch);
        p.createOrders(new Product("MFC1801012B0C"), 125, empch);
        p.createOrders(new Product("MFC1802012B0C"), 15, empch);
        System.out.println(p.toString());
        System.out.println("------------------------------------------------");
        System.out.println();
    }

}