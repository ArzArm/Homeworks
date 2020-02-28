public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 5,1, 2, 3, -2, 0, 7};
        int i;
        int result;
        int min = 0;
        boolean check = true;

        while (check){
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
                check = false;
            }
        }
    }
}

