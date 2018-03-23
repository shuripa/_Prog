package boards.employees;

import java.util.ArrayList;

public class EmployeeChanges {
    private char name;
    ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeChanges(char name) {
        this.name = name;
    }

    public void setEmployees(Employee employee) {
        this.employees.add(employee);
    }

    public void printChanges(){
        int i = 0;
        System.out.println("Смена: " + name);
        for (Employee em: employees) {
                System.out.println("" + (i+1) + ". " + em.toString());
            i++;
        }

    }

}
