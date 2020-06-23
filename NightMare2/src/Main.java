public class Main {
    public static void main(String[] args) {
        String digitString = "500222543";
        int i;
        char[] chars = digitString.toCharArray();

        for (i = chars.length - 1; i > 0; i--) {
            if (chars[i] > chars[i - 1]) {
                break;
            }
        }
        for (int j = 0; j < (chars.length - i) / 2; j++) {
            swap(chars, j + i, chars.length - 1 - j);
        }
        for (int j = i; j < chars.length; j++) {
            if (i == 0) {
                break;
            } else {
                if (chars[i - 1] < chars[j]) {
                    swap(chars, i - 1, j);
                    break;
                }
            }
        }
        System.out.println(new String(chars));
    }
    static void swap(char[] arr, int n1, int n2) {
        char tmp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = tmp;
    }
}
