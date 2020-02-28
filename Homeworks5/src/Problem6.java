public class Problem6 {
    public static void main(String[] args) {
        int[] arr = new int[]{55, 25, 36, 896, 2589, 2369, -5698, 8968, 25, 1, -5698, 2635, 0, 25, 1};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element: " + max + "\n" +"Minimum element: " + min);
    }
}