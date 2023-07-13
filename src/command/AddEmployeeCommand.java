package command;

import employee.Employee;
import employee.EmployeeList;
import employee.factory.EmployeeFactory;

public class AddEmployeeCommand implements Command {

    private final EmployeeList employeeList;
    private final EmployeeFactory employeeFactory;

    public AddEmployeeCommand(EmployeeList employeeList, EmployeeFactory employeeFactory) {
        this.employeeList = employeeList;
        this.employeeFactory = employeeFactory;
    }

    @Override
    public void execute() {
        Employee employee = employeeFactory.create();
        employeeList.add(employee);
    }

}
