import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Input a string: ");
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.nextLine();
        char[] newChar = newString.toCharArray();
        boolean isStringPalindrome = true;

        for (int i = 0; i < newChar.length; i++) {
            if (newChar[i] != newChar[(newChar.length - 1) - i]) {
                isStringPalindrome = false;
                System.out.println("Not a palindrome");
                break;
            }
        }
        if (isStringPalindrome) {
            System.out.println("Palindrome");
        }
    }
}
