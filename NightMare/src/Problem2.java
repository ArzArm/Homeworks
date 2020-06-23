public class Problem2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6, -7, 8, 9, 1, 0};
        int min = 1;
        boolean isValueExist = true;

        while (isValueExist) {
            isValueExist = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    isValueExist = true;
                    min++;
                    break;
                }
            }
            if (!isValueExist) {
                System.out.println(min);

            }
        }
    }
}

