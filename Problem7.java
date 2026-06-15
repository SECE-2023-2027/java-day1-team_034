import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int n = sc.nextInt();

        String octal = "";
        while (n > 0) {
            int rem = n % 8;
            octal = rem + octal;
            n = n / 8;
        }

        System.out.println("Octal number is: " + octal);
    }
}