public class Problem4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 5, 6, 11, 15, 50, 69, 45, 45};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i] + 5;
            arr1[i] = arr2[i];
            System.out.print(arr1[i] + " ");

        }
    }
}
