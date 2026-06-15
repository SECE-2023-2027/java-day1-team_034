import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = sc.nextInt();

        int result = (number % 2 == 0) ? 1 : 0;
        System.out.println(result);

        sc.close();
    }
}
