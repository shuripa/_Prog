package boards.employees;

import org.junit.jupiter.api.Test;

class EmployeeChangesTest {
        EmployeeChanges ech = new EmployeeChanges('A');

    @Test
    void setEmployees() {
        ech.setEmployees(new Employee(12713));
        ech.setEmployees(new Employee(12700));
        ech.setEmployees(new Employee(14122));
        ech.printChanges();
    }

    @Test
    void printEployees() {
    }
}