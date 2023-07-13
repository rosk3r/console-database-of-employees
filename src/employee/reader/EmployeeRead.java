package employee.reader;

import employee.Employee;
import employee.EmployeeList;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EmployeeRead {

    private final EmployeeList employeeList;

    public EmployeeRead(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    public void employeeDataRead() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(employeeList.filePath))) {
            ArrayList<Employee> readList = (ArrayList<Employee>) ois.readObject();
            employeeList.addAll(readList);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
