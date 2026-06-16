import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a character: ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println("No character entered.");
        } else {
            char ch = input.charAt(0);
            int asciiValue = ch;
            System.out.println("The ASCII value of " + ch + " is :" + asciiValue);
        }

        sc.close();
    }
}
