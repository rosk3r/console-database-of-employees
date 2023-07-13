package menu;

import command.*;
import employee.EmployeeList;
import employee.factory.*;
import employee.reader.EmployeeRead;
import employee.writer.EmployeeWrite;
import utils.UI;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final EmployeeFactory employeeFactory = new EmployeeFactory();
    private final OtherFactory otherFactory = new OtherFactory();
    private final ManagerFactory managerFactory = new ManagerFactory();
    private final EmployeeList employeeList = new EmployeeList();
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeWrite employeeWrite = new EmployeeWrite(employeeList);

    private final Map<String, Command> commandMap = new HashMap<>() {{
        put("add employee", new AddEmployeeCommand(employeeList, employeeFactory));
        put("add manager", new AddManagerCommand(employeeList, managerFactory));
        put("add other", new AddOtherCommand(employeeList, otherFactory));
        put("print", new PrintAllCommand(employeeList));
        put("link employee", new LinkEmployeeCommand(employeeList, scanner));
        put("get link", new GetLinkedEmployeeCommand(employeeList, scanner));
        put("sort by fio", new EmployeeSortByFioCommand(employeeList));
        put("sort by date", new EmployeeSortByDateCommand(employeeList));
        put("delete", new DeleteEmployeeCommand(employeeList, scanner));
        put("delete all", new DeleteAllEmployeeCommand(employeeList));
        put("close", new CloseCommand());
    }};

    public void open() {
        System.out.print("Enter file name: ");
        employeeList.filePath = scanner.nextLine();
        employeeList.filePath += ".dat";

        File myFile = new File(employeeList.filePath);
        if (!myFile.exists()) {
            EmployeeWrite employeeWrite = new EmployeeWrite(employeeList);
            employeeWrite.employeeDataWrite();
            System.out.println("File (" + employeeList.filePath + ") was created.");
        } else {
            EmployeeRead employeeRead = new EmployeeRead(employeeList);
            employeeRead.employeeDataRead();
            System.out.println("File (" + employeeList.filePath + ") was read.");
        }

        while (true) {
            employeeWrite.employeeDataWrite();

            UI.mainMenu();
            String mainMenuCommand = scanner.nextLine();

            if (!commandMap.containsKey(mainMenuCommand)) {
                System.out.println("Command [" + mainMenuCommand + "] does not exist!");
                continue;
            }
            commandMap.get(mainMenuCommand).execute();
        }
    }

}
