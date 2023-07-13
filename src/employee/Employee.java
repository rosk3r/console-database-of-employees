package employee;

import java.io.Serializable;

public class Employee implements Serializable {

    public final String employmentDate;
    public final String fullName;
    public final String birthDate;

    public Employee(String fullName, String birthDate, String employmentDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
    }

    @Override
    public String toString() {
        return "Employee: [Full Name: (" + fullName + ") Birth Date: (" + birthDate + ") Employment Date: (" + employmentDate + ")]";
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

}
