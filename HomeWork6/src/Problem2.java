import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Input a string: ");
        Scanner scanner = new Scanner(System.in);
        String newString = scanner.nextLine();
        char[] newChar = newString.toCharArray();
        int wordCounter = 0;
        int spaceCounter = 1;

        for (int i = 0; i < newChar.length; i++) {
            if (newChar[i] == ' ') {
                spaceCounter++;
            } else if (spaceCounter > 0) {
                wordCounter++;
                spaceCounter = 0;
            }
        }
        System.out.println(wordCounter);
    }
}