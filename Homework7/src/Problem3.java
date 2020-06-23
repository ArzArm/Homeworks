public class Problem3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 25, 36, 25, 69, 2, 3, 6, 0, 2};
        int num = 25;
        System.out.println(numbersFirstIndex(num, arr));
    }

    public static int numbersFirstIndex(int x, int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        return index;
    }
}
