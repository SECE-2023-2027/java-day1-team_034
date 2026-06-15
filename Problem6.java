import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int n = sc.nextInt();
        System.out.println("Hexadecimal number is: "
                + Integer.toHexString(n).toUpperCase());
    }
}