public class Problem8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 9, 8, 7, 6, 5, 4, 3, 2, 1};
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
