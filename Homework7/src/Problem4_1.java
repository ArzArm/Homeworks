import java.util.Arrays;

public class Problem4_1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"asd", "dfg", "124", "ased", "fgrt"};
        stringReversInArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void stringReversInArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String name = arr[i];
            char[] array = name.toCharArray();
            for (int j = 0; j < name.length() / 2; j++) {
                char tmp = array[j];
                array[j] = array[name.length() - 1 - j];
                array[name.length() - 1 - j] = tmp;
            }
            arr[i] = new String(array);
        }
    }
}

