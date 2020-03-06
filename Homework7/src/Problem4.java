import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"asd", "dfg", "124", "ased", "fgrt"};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stringRevers(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static String stringRevers(String name) {
        char[] array = name.toCharArray();
        for (int i = 0; i < name.length() / 2; i++) {
            char tmp = array[i];
            array[i] = array[name.length() - 1 - i];
            array[name.length() - 1 - i] = tmp;
        }
        return new String(array);
    }
}

