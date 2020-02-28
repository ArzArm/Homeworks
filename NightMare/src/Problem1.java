public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{-12, 1, 0, 12598, 45, 3, 41, 2, 67, 6};
        int i, j;

        int[] newArr = new int[arr.length + 1];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] <= arr.length) {
                    newArr[arr[i] - 1] = arr[i];
                }
            }
        }
        for (j = 0; j < newArr.length; j++) {
            if (newArr[j] == 0) {
                int smallestNumber = j + 1;
                System.out.println("The smallest positive integer which does not occur in array is: " + smallestNumber);
                break;
            }
        }
    }
}


