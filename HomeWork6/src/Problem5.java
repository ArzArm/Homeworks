import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Input first string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Input second string: ");
        String rotatedString = scanner.nextLine();

        if (string.length() != rotatedString.length()) {
            System.out.println("Is  not a rotation");
        } else if (string.equals(rotatedString)) {
            System.out.println("Is a rotation");
        } else {
            String newString = string.repeat(2);
            boolean isStringRotated = false;
            for (int i = 0; i <= rotatedString.length(); i++) {
                boolean found = true;
                for (int j = 0, k = i; j < rotatedString.length() && k < newString.length(); j++, k++) {
                    if (rotatedString.charAt(j) != newString.charAt(k)) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    isStringRotated = true;
                    break;
                }
            }
            if (isStringRotated) {
                System.out.println("Is a rotation:");
            } else {
                System.out.println("Is not a rotation:");
            }
        }
    }
}