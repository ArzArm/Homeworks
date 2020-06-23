public class Problem10_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 2, 4, 5, 0, 56, 45, 2, 15, 2, 45, 2, 0, 0, 58, 45, 25, 0};
        int k = 5;
        int i;
        int counter = 0;
        boolean isOccurred = false;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        if (counter == k) {
            System.out.println("0");
        }
        for (i = 0; i < arr.length; i++) {
            counter = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j] && arr[i] != 0) {
                    counter++;
                }
            }
            if (counter == k) {
                System.out.println(arr[i]);
                arr[i] = 0;
                isOccurred = true;
            }
        }
        if (!isOccurred) {
            System.out.println("There isn't any number that repeats " + k + " times.");
        }
    }
}
