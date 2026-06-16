import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int first = sc.nextInt();

        System.out.print("Input the second number: ");
        int second = sc.nextInt();

        System.out.print("Input the third number : ");
        int third = sc.nextInt();

        int d1 = first % 10;
        int d2 = second % 10;
        int d3 = third % 10;

        boolean result = (d1 == d2) || (d1 == d3) || (d2 == d3);
        System.out.println("The result is: " + result);

        sc.close();
    }
}
