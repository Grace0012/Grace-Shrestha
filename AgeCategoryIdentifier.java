import java.util.Scanner;

public class AgeCategoryIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 0 && age <= 12) {
            System.out.println("You are a Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager.");
        }
        else if (age >= 20 && age <= 59) {
            System.out.println("You are an Adult.");
        }
        else if (age >= 60) {
            System.out.println("You are a Senior.");
        }

        scanner.close();
    }
}
