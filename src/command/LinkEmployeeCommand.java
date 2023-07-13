package command;

import employee.Employee;
import employee.EmployeeList;
import employee.Manager;

import java.util.Optional;
import java.util.Scanner;

public class LinkEmployeeCommand implements Command {

    private final EmployeeList employeeList;
    private final Scanner scanner;

    public LinkEmployeeCommand(EmployeeList employeeList, Scanner scanner) {
        this.employeeList = employeeList;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        Employee linkedEmployee;
        Manager linkedManager;

        System.out.print("Enter manager FIO: ");
        String managerFioForLink = scanner.nextLine();

        System.out.print("Enter employee FIO: ");
        String employeeFioForLink = scanner.nextLine();

        Optional<Employee> managerOptional = employeeList.getAll()
                .stream()
                .filter(manager -> manager.getFullName().equals(managerFioForLink))
                .findFirst();
        Optional<Employee> employeeOptional = employeeList.getAll()
                .stream()
                .filter(employee -> employee.getFullName().equals(employeeFioForLink))
                .findFirst();

        if (managerOptional.isPresent() && employeeOptional.isPresent()) {
            linkedManager = (Manager) managerOptional.get();
            linkedEmployee = employeeOptional.get();
            linkedManager.linkEmployee(linkedEmployee);
        } else {
            System.out.println("Manager or Employee does not exist.");
        }
    }

}
