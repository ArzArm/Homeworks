public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, -5, -2, -3, -2, 0, 2, -7};
        int min = 0;
        boolean isValueExist = true;

        while (isValueExist) {
            isValueExist = false;
            min++;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    isValueExist = true;
                    break;
                }
            }
            if (!isValueExist) {
                System.out.println(min);
                break;
            }
        }
    }
}

