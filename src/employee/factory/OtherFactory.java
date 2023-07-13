package employee.factory;

import employee.Other;

import java.util.Scanner;

public class OtherFactory {

    private final Scanner scanner = new Scanner(System.in);

    public Other create() {
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter birth date: ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter employment date: ");
        String employmentDate = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        return new Other(
                fullName,
                birthDate,
                employmentDate,
                description);
    }

}
