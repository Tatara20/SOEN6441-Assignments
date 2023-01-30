public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String firstName, String lastName, int age, int id) {
        super(firstName, lastName, age, id);
    }

    @Override
    public int getMonthlySalary() {
        return 0;
    }
}
