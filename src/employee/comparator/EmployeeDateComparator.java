package employee.comparator;

import employee.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class EmployeeDateComparator implements Comparator<Employee> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public int compare(Employee a, Employee b) {
        try {
            Date employmentDateA = dateFormat.parse(a.getEmploymentDate());
            Date employmentDateB = dateFormat.parse(b.getEmploymentDate());
            return employmentDateB.compareTo(employmentDateA);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
