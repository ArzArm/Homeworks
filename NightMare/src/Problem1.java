public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 110, 1, -2, 0, -2, 0, 3, 10, 1256, 0, 2};

        int i, j;
        int max = 1;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] newArr = new int[max];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[arr[i] - 1] = arr[i];
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


