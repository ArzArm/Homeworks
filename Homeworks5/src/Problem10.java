public class Problem10 {
    public static void main(String[] args) {
        int[] arr = new int[]{45, 2, 4, 2, 45,0};
        int k = 5;
        int i;

        int newCounter = 0;
        int[] newArr = new int[arr.length];
        for (i = 0; i < arr.length; i++) {
            int counter = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter == k) {
                boolean isValueExsiste = false;
                for (int l = 0; l < newCounter; l++) {
                    if (newArr[l] == arr[i]) {
                        isValueExsiste = true;
                        break;
                    }
                }
                if (!isValueExsiste) {
                    newArr[newCounter] = arr[i];
                    newCounter++;
                }
            }
        }
        for (int l = 0; l < newCounter; l++) {
            System.out.println(newArr[l]);
        }
    }
}
