package employee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    public final List<Employee> linkedEmployeeList = new ArrayList<>();

    public Manager(String fullName, String birthDate, String employmentDate) {
        super(fullName, birthDate, employmentDate);
    }

    public void linkEmployee(Employee employee) {
        linkedEmployeeList.add(employee);
    }

    public void getLinkedEmployee() {
        boolean employeeIsLinked = false;
        for (Employee emp : linkedEmployeeList) {
            employeeIsLinked = true;
            System.out.println(emp);
        }

        if (!employeeIsLinked) {
            System.out.println("The manager has no subordinates.");
        }
    }

    @Override
    public String toString() {
        return "Manager: [Full Name: (" + fullName + ") Birth Date: (" + birthDate + ") Employment Date: (" + employmentDate + ")]";
    }

}
