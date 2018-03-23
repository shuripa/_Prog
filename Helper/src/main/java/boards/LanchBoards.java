package boards;

import boards.employees.Employee;
import boards.places.Position;

public class LanchBoards {
    public static void main(String[] args) {
        Position wpPos = new Position();
        Employee e1 = new Employee(12713);
        Employee e2 = new Employee(12700);
        Employee e3 = new Employee(14122);
        wpPos.setEmployee(e1);
    }
}
