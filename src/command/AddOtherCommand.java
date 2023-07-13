package command;

import employee.EmployeeList;
import employee.Other;
import employee.factory.OtherFactory;

public class AddOtherCommand implements Command{

    private final EmployeeList employeeList;
    private final OtherFactory otherFactory;

    public AddOtherCommand(EmployeeList employeeList, OtherFactory otherFactory) {
        this.employeeList = employeeList;
        this.otherFactory = otherFactory;
    }

    @Override
    public void execute() {
        Other other = otherFactory.create();
        employeeList.add(other);
    }

}
