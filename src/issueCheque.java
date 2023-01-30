import java.util.Scanner;

public class issueCheque {
    public static void main(String[] args) {
        System.out.println("""
                Main menu
                1. Add an employee
                2. Add a bill
                3. Issue cheques
                4. Exit
                """);
        getUserInput();
    }

    private static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter your selection: ");
                int selection = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException ignore) {
            }
        }
    }
}