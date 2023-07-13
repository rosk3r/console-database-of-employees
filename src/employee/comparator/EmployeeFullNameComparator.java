package employee.comparator;

import employee.Employee;

import java.util.Comparator;

public class EmployeeFullNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {
        return CharSequence.compare(a.getFullName(), b.getFullName());
    }

}
