package command;

import employee.Employee;
import employee.EmployeeList;
import employee.Manager;

import java.util.Optional;
import java.util.Scanner;

public class GetLinkedEmployeeCommand implements Command {

    private final EmployeeList employeeList;
    private final Scanner scanner;

    public GetLinkedEmployeeCommand(EmployeeList employeeList, Scanner scanner) {
        this.employeeList = employeeList;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        Manager linkedManager;

        System.out.print("Enter manager FIO: ");
        String managerFioForLink = scanner.nextLine();

        Optional<Employee> managerOptional = employeeList.getAll()
                .stream()
                .filter(manager -> manager.getFullName().equals(managerFioForLink))
                .findFirst();

        if (managerOptional.isPresent()) {
            linkedManager = (Manager) managerOptional.get();
            linkedManager.getLinkedEmployee();
        } else {
            System.out.println("Manager does not exist.");
        }
    }

}
