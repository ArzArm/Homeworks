import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println("Input parenthesis sequence : ");
        Scanner scanner = new Scanner(System.in);
        String parenthesisSequence = scanner.nextLine();
        int leftCounter = 0;
        int rightCounter = 0;
        int k, j;
        j = 0;
        k = 0;

        for (int i = 0; i < parenthesisSequence.length(); i++) {
            if (parenthesisSequence.charAt(i) == '(') {
                leftCounter++;
                k += i;
            } else if (parenthesisSequence.charAt(i) == ')') {
                rightCounter++;
                j += i;
            }
        }
        if (leftCounter == rightCounter && k < j) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
