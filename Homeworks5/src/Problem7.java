public class Problem7 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 5, 6, 11, 15, 50, 69, 45, 45};
        int[] arr2 = new int[arr1.length];
        int lastIndex = arr1.length - 1;

        System.out.print("{ ");
        for (int i = 0; i <= lastIndex; i++) {
            arr2[i] = arr1[lastIndex - i];
            System.out.print(arr2[i]);
            if (i != lastIndex) {
                System.out.print(", ");
            }
        }
        System.out.print(" }");

    }
}
