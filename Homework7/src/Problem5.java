import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Input a positive number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Invalid number!!!");
        } else {
            System.out.println(zerosCountEvenOrNo(num));
        }
    }

    public static boolean zerosCountEvenOrNo(int x) {
        int count = 0;
        boolean result = false;
        while (x / 10 > 0) {
            if (x % 10 == 0) {
                count++;
                x = x / 10;
            } else {
                x = x / 10;
            }
        }
        if (count % 2 == 0) {
            result = true;
        }
        return result;
    }
}


