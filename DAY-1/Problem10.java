import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input an integer
        System.out.print("Input an integer: ");
        String number = scanner.nextLine();
        
        // Compute the sum of digits
        int sum = 0;
        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {
                sum += Character.getNumericValue(digit);
            }
        }
        
        // Display the result
        System.out.println("The sum of the digits is: " + sum);
        
        scanner.close();
    }
}
