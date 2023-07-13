package command;

import employee.EmployeeList;

public class DeleteAllEmployeeCommand implements Command {

    private final EmployeeList employeeList;

    public DeleteAllEmployeeCommand(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void execute() {
        employeeList.clear();
        System.out.println("Database cleared.");
    }

}
