public class Problem9 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 5, 4, 6, 45};
        int[] arr2 = new int[]{2, 4, 5, 56, 45, 11, 15};

        for (int i = 0; i < arr1.length; i++) {
            boolean isNotOccurred = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isNotOccurred = false;
                    break;
                }
            }
            if (isNotOccurred) {
                System.out.println(arr1[i]);
            }
        }

    }
}
