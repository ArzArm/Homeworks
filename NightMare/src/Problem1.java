public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, -1, 0, -3, 13, 15, 16, 17, 18, 19, 20};
        int i;
        int j;
        int result;
        int min = 0;

        for (i = 1; i < arr.length; i++) {
            if (arr[i] <= min && arr[i] >= 1) {
                min = arr[i];
            }
        }
        for (j = 0; j < arr.length; j++) {
            boolean isValueExist = false;
            min = min + 1;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    isValueExist = true;
                    break;
                }
            }
            if (!isValueExist) {
                result = min;
                System.out.println(result);
                break;
            }
        }
    }
}

