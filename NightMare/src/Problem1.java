public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, 1002, 13, 1154, -15, 0, 17, 21, 18, 19, 20, 22, 24};
        int i, j;

        int[] newArr = new int[arr.length * 2];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] <= arr.length) {
                    newArr[arr[i] - 1] = arr[i];
                } else {
                    newArr[arr.length + i] = arr[i];
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


