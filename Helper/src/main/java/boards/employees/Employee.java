package boards.employees;

public class Employee {
    private int id;
    public Employee(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "" + id;
    }
}
