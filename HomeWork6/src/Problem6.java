import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println("Input parenthesis sequence : ");
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        int counter = 0;
        boolean isLoopCompleted = true;

        if (sequence.charAt(0) == ')' || sequence.charAt(sequence.length() - 1) == '(') {
            System.out.println("Invalid");
        } else {
            for (int i = 0; i < sequence.length(); i++) {
                if (sequence.charAt(i) == '(') {
                    counter++;
                } else if (sequence.charAt(i) == ')') {
                    counter--;
                } else {
                    System.out.println("Sequence contains untrue symbol!!!!");
                    isLoopCompleted = false;
                    break;
                }
                if (counter == 0 && i != sequence.length() - 1) {
                    if (sequence.charAt(i + 1) == ')') {
                        System.out.println("Invalid");
                        isLoopCompleted = false;
                        break;
                    }
                }
            }
            if (isLoopCompleted) {
                if (counter != 0) {
                    System.out.println("Invalid");
                } else {
                    System.out.println("Valid");
                }
            }
        }
    }
}
