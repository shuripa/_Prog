package boards;

import boards.employees.Employee;
import boards.places.WPPosition;

public class LanchBoards {
    public static void main(String[] args) {
        WPPosition wpPos = new WPPosition();
        Employee e1 = new Employee(12713);
        Employee e2 = new Employee(12700);
        Employee e3 = new Employee(14122);
        wpPos.setEmployee(e1);
    }
}
