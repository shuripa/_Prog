package boards.places;

import boards.employees.Employee;

public class Position {
    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString(){
        if (employee != null)
            return employee.toString();
        else return "empty";
    }
}
