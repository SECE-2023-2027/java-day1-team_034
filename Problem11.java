import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("The string is :  ");
        String inputString = sc.nextLine();
        
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;
        
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (c == ' ') {
                spaces++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else {
                others++;
            }
        }
        
        System.out.println("letter: " + letters);
        System.out.println("space: " + spaces);
        System.out.println("number: " + numbers);
        System.out.println("other: " + others);
        
        sc.close();
    }
}
