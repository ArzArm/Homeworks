public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int i;
        int j;
        int result;
        int min = 0;

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

