package employee.factory;

import employee.Employee;

import java.util.Scanner;

public class EmployeeFactory {

    private final Scanner scanner = new Scanner(System.in);

    public Employee create() {
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter birth date (format: dd.MM.yyyy): ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter employment date (format: dd.MM.yyyy): ");
        String employmentDate = scanner.nextLine();

        return new Employee(
                fullName,
                birthDate,
                employmentDate);
    }

}
