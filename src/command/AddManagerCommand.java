package command;

import employee.EmployeeList;
import employee.Manager;
import employee.factory.ManagerFactory;

public class AddManagerCommand implements Command {

    private final EmployeeList employeeList;
    private final ManagerFactory managerFactory;

    public AddManagerCommand(EmployeeList employeeList, ManagerFactory managerFactory) {
        this.employeeList = employeeList;
        this.managerFactory = managerFactory;
    }

    @Override
    public void execute() {
        Manager manager = managerFactory.create();
        employeeList.add(manager);
    }

}
