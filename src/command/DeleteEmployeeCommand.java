package command;

import employee.Employee;
import employee.EmployeeList;

import java.util.Optional;
import java.util.Scanner;

public class DeleteEmployeeCommand implements Command {

    private final EmployeeList employeeList;
    private final Scanner scanner;

    public DeleteEmployeeCommand(EmployeeList employeeList, Scanner scanner) {
        this.employeeList = employeeList;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        Employee deletedEmployee;

        System.out.println("Enter employee FIO to delete: ");
        String employeeFioToDelete = scanner.nextLine();

        Optional<Employee> employeeToDelete = employeeList.getAll()
                .stream()
                .filter(manager -> manager.getFullName().equals(employeeFioToDelete))
                .findFirst();

        if (employeeToDelete.isPresent()) {
            deletedEmployee = employeeToDelete.get();
            employeeList.removeEmployee(deletedEmployee);
        } else System.out.println("Employee does not exist.");
    }

}
