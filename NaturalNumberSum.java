
import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer n: ");
        
        // Read the integer input
        int n = scanner.nextInt();
        
        // Validate input
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum of the first n natural numbers
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i; // Add the current number to the sum
            }
            
            // Output the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }
}
