import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Input a string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Input number of rotations:");
        int n = scanner.nextInt();
        if (n > string.length()) {
            n = n % string.length();
        }
        if (n == 0) {
            System.out.println(string);
        } else {
            String newString = string.repeat(2);
            char[] chars = newString.toCharArray();
            char[] newChar = new char[string.length()];
            for (int i = n, j = 0; i < string.length() + n; i++, j++) {
                newChar[j] = chars[i];
            }
            System.out.println(new String(newChar));
        }
    }
}
