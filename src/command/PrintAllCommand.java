package command;

import employee.EmployeeList;

public class PrintAllCommand implements Command {

    private final EmployeeList employeeList;

    public PrintAllCommand(EmployeeList personList) {
        this.employeeList = personList;
    }

    @Override
    public void execute() {
        if (!employeeList.getAll().isEmpty()) {
            employeeList.getAll().forEach(System.out::println);
        } else System.out.println("Database is empty.");
    }

}
