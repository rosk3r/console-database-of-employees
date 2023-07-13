package command;

import employee.EmployeeList;
import employee.comparator.EmployeeFullNameComparator;

public class EmployeeSortByFioCommand implements Command {

    private final EmployeeList employeeList;

    public EmployeeSortByFioCommand(EmployeeList employeesList) {
        this.employeeList = employeesList;
    }

    @Override
    public void execute() {
        if (!employeeList.getAll().isEmpty()) {
            employeeList.getAll().stream().sorted(new EmployeeFullNameComparator()).forEach(System.out::println);
        } else System.out.println("Database is empty.");
    }

}
