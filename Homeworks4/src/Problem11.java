import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        System.out.println("Input an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        boolean isPrimeNumber = true;
        if (n == 0 || n == 1) {
            System.out.println(n + " isn't prime number ");
        }
        while (i < n) {
            if (n % i != 0) {
                i++;
                continue;
            } else {
                isPrimeNumber = false;
                break;
            }
        }
        if (isPrimeNumber) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " isn't prime number");
        }
    }

}



