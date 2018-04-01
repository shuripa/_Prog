package boards.employees;

import boards.places.Board;
import boards.places.Machine;
import boards.places.Position;
import boards.plan.Plan;
import boards.products.Product;
import org.junit.jupiter.api.Test;

class EmployeeChangesTest {

        EmployeeChanges empch = new EmployeeChanges('A');       //Крок 5. Створення зміни.
        Plan plan = new Plan();
        Machine machine;
        Board board;
        //TODO: Створити робочий календар для змін

    @Test
    void setEmployees() {

        createEmployee();               //Крок10. Створення працівників.
        createBoard();                  //Крок20. Створення дошки.
        createPlan();                   //Крок30. Створення плану.  //TODO: перейменувати обєкт plan на об'єкт pool
        createMachine(board);           //Крок33. Створення машини.
        assignPlan();                   //Крок35. Закидання плану на машину.
        loginEmployee();                //Крок40. Логування.
        formingStart();                 //Крок50.1. Стартування.
        forming();                      //Крок60.1. Формування.
        formingFinish();                //Крок70.1. Фінішування.


        //Крок50.2. Стартування.
        System.out.println("----Крок5.2. ----Стартування. Видрук плану позиції. Видрук унікального номеру.----");
//            System.out.println("Номер модулю: " + idGen.getModuleId());
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

    private void formingFinish() {
        //Крок70.1. Фінішування.
        System.out.println("----Крок7.1. ----Фінішування.----");
        System.out.println("------------------------------------------------");
        machine.finish(1);
        //TODO: Фінішування не реалізоване
        System.out.println();
    }

    private void forming() {
        //Крок60.1. Формування.
        System.out.println("----Крок6.1. ----Формування.----");
        int timeForm = (int)(Math.random()*10);
        //TODO: Зафіксувати час формування для даного модулю.
        System.out.println("Час формування = " + timeForm);
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    private void formingStart() {
        //Крок50.1. Стартування.
        System.out.println("----Крок50.1. ----Стартування. Видрук плану позиції. Видрук унікального номеру.----");
//        machine.start(board.getBoardId());   //функція старту для дошки. Номер дошки передається ззовні. Взята довільна дошка.
        machine.start(1323);
        //TODO: створення модулю.
        System.out.println("             Машина" +
                "                        Дошка" +
                "                    Залогований працівник" +
                "   Модуль" +
                "                         Замовлення на машині" +
                "         Статистика замовлення");
        System.out.println(machine.toString());
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    private void loginEmployee() {
        //Крок40. Логування.
        System.out.println("----Крок40. ----Логування----");
        board.getPosition(0).setEmployeeStated(empch.employees.get(0));              //TODO: Перенести логування працівника з позиції в клас Machine.
        System.out.println("Залогований працівник: " + empch.employees.get(0).toString());  //TODO: Заглушка. Виправити.
        System.out.println(machine.toString());
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    private void assignPlan() {
        //Крок35 Закидання плану на машину.
        System.out.println("----Крок35 ----Закидання плану на машину----");
        machine.setOrder(plan.getOrder(0)); //TODO: Насправді повинно вибиратись конкретне замовлення з плану і закидати на машину. Поки це 0-заказ из масиву.
        System.out.println(machine.toString());
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    private void createMachine(Board board) {
        //Крок33. Створення машини
        System.out.println("----Крок33 ----створення машини----");
        machine = new Machine("MB-01");
        machine.setBoard(board);
        System.out.println(machine.toString());
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    private void createPlan() {
        //Крок30. Створення плану.
        System.out.println("----Крок30. ----Створення плану. Видрук плану.----");
        plan.createOrders(new Product("MFC1841029A0B"),6, empch);
        plan.createOrders(new Product("MFC1841189B0C"), 26, empch);
        plan.createOrders(new Product("MFC1801012B0C"), 125, empch);
        plan.createOrders(new Product("MFC1802012B0C"), 15, empch);
        System.out.println(plan.toString());
        System.out.println("------------------------------------------------");
        System.out.println();
    }

    private void createBoard() {
        //Крок20. Дошки.
        //TODO: Потрібно створити клас BoardStock і отримувати дошки звідти.
        System.out.println("----Крок20.----Створення дошки і позиції-----");
        board = new Board(1323);
        Position wp = new Position();
        board.setPositions(wp);
        System.out.println(board.toString());
        System.out.println("------------------------------------------------");
        System.out.println();
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

}