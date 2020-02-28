public class Problem8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 4, -5, 6, 7, 8, 9, 10, 11, 12};
        int i;
        int lastIndex = arr.length - 1;

        System.out.print("{ ");
        for (i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] + arr[lastIndex - i];
            arr[lastIndex - i] = arr[i] - arr[lastIndex - i];
            arr[i] = arr[i] - arr[lastIndex - i];
        }
        for (i = 0; i <= lastIndex; i++) {
            System.out.print(arr[i]);
            if (i != lastIndex) {
                System.out.print(", ");
            }
        }
        System.out.print(" }");
    }
}
