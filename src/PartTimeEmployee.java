public class PartTimeEmployee extends Employee {
    // For part-time employees only
    private final int echclon;
    private final int hoursWorked;

    public PartTimeEmployee(String firstName, String lastName, int age, int id, int echclon, int hoursWorked) {
        super(firstName, lastName, age, id);
        this.echclon = echclon;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int getMonthlySalary() {
        return switch (echclon) {
            case 1 -> 15 * hoursWorked;
            case 2 -> 20 * hoursWorked;
            case 3 -> 25 * hoursWorked;
            case 4 -> 30 * hoursWorked;
            case 5 -> 40 * hoursWorked;
            default -> -9999;
        };
    }
}
