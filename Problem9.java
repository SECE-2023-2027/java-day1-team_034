import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a string
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();
        
        // Reverse the string
        String reversedString = new StringBuilder(inputString).reverse().toString();
        
        // Display the result
        System.out.println("Reverse string: " + reversedString);
        
        scanner.close();
    }
}
