import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Input a string: ");
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.next();
        boolean isIndexValid = false;
        int k = 0;

        while (!isIndexValid) {
            System.out.println("Input an index: ");
            k = scanner.nextInt();
            if (k >= newString.length()) {
                System.out.println("out of bounds");
            } else {
                isIndexValid = true;
            }
        }
        char ch = newString.charAt(k);
        System.out.println("Character at index " + k + " is " + ch);
    }
}
