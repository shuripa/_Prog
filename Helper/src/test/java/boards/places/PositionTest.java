package boards.places;

//Простой тест операции присоединения работника к рабочему месту

import boards.employees.Employee;
import org.junit.Test;

public class PositionTest {
    @Test
    public void shouldAdd(){
        Employee e = new Employee(12713);
        Position wpPos = new Position();
        wpPos.setEmployee(e);
    }
}