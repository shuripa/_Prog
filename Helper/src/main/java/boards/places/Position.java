package boards.places;

import boards.employees.Employee;

public class Position {
    private Employee employeeStated;

    public void setEmployeeStated(Employee employeeStated) {
        this.employeeStated = employeeStated;
    }

    @Override
    public String toString(){
        if (employeeStated != null)
            return employeeStated.toString();
        else return "Позиція пуста";
    }
}
