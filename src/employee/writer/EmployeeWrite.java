package employee.writer;

import employee.EmployeeList;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeWrite {

    private final EmployeeList employeeList;

    public EmployeeWrite(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    public void employeeDataWrite() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(employeeList.filePath))) {
            oos.writeObject(employeeList.getAll());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
