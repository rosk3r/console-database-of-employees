package employee.factory;

import employee.Manager;

import java.util.Scanner;

public class ManagerFactory {

    private final Scanner scanner = new Scanner(System.in);

    public Manager create() {
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter birth date: ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter employment date: ");
        String employmentDate = scanner.nextLine();

        return new Manager(
                fullName,
                birthDate,
                employmentDate);
    }

}
