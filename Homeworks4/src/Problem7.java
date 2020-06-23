import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println("Input an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += (i % 2 == 0 ? - i : i);
            /*if (i % 2 == 0) {
                sum = sum - i;
            } else{
                sum = sum + i;
            }*/
            i++;
        }
        System.out.println(sum);
    }
}
