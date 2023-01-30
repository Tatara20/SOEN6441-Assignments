public abstract class Employee implements EmployeeInter {
    // For all employees
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int id;

    // Constructor for all employee
    public Employee(String firstName, String lastName, int age, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
}
