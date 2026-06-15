import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        String b1 = sc.next();

        System.out.print("Input second binary number: ");
        String b2 = sc.next();

        int n1 = Integer.parseInt(b1, 2);
        int n2 = Integer.parseInt(b2, 2);

        int sum = n1 + n2;

        System.out.println("Sum of two binary numbers: "
                + Integer.toBinaryString(sum));
    }
}