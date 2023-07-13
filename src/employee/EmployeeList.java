package employee;

import java.util.ArrayList;

public class EmployeeList {

    public String filePath;
    private final ArrayList<Employee> employees = new ArrayList<>();

    public final ArrayList<Employee> getAll() {
        return new ArrayList<>(employees);
    }

    public final void removeEmployee(Employee employeeToDelete) {
        employees.remove(employeeToDelete);
    }

    public final void add(Employee employee) {
        employees.add(employee);
    }

    public final void addAll(ArrayList<Employee> employees) {
        this.employees.addAll(employees);
    }

    public final void clear() {
        employees.clear();
    }

}
