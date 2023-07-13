package employee;

public class Other extends Employee {

    public final String description;

    public Other(String fullName, String birthDate, String employmentDate, String description) {
        super(fullName, birthDate, employmentDate);
        this.description = description;
    }

    @Override
    public String toString() {
        return "Other: [Full Name: (" + fullName + ") Birth Date: (" + birthDate + ") Employment Date: (" + employmentDate + ")\n"
                + "\tDescription: (" + description + ")]";
    }

}
