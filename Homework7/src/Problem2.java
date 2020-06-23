import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Input two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num =percentageCounter(num1, num2);
        System.out.println(num);
    }
    public static int percentageCounter(int x, int y) {
        return (y - x) *100 / x;
    }
}