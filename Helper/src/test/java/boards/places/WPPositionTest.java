package boards.places;

//Простой тест операции присоединения работника к рабочему месту

import boards.employees.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

public class WPPositionTest {
    @Test
    public void shouldAdd(){
        Employee e = new Employee(12713);
        WPPosition wpPos = new WPPosition();
        wpPos.setEmployee(e);
    }
}