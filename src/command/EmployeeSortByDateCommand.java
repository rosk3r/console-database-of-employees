package command;

import employee.EmployeeList;
import employee.comparator.EmployeeDateComparator;

public class EmployeeSortByDateCommand implements Command {

    private final EmployeeList employeeList;

    public EmployeeSortByDateCommand(EmployeeList employeesList) {
        this.employeeList = employeesList;
    }

    @Override
    public void execute() {
        if (!employeeList.getAll().isEmpty()) {
            employeeList.getAll().stream().sorted(new EmployeeDateComparator()).forEach(System.out::println);
        } else System.out.println("Database is empty.");
    }

}
