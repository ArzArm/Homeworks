import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Armen", "Karen", "Anna", "Sevak", "Hasmik"};
        int n = arr.length;
        int i;
        boolean foundOrNot = false;
        String name = "Karen";

        for (i = 0; i < n ; i++) {
            if (arr[i].equals(name)) {
                foundOrNot = true;
                break;
            }
        }
        if (foundOrNot) {
            System.out.println(name + " is " + i + " element ");
        } else {
            System.out.println("Not found");
        }
    }
}
