public class Problem5 {
    public static void main(String[] args) {
        char[] arr = new char[]{'a', 'b', 'c', 'd', 'c', 'd', 'c', 'd'};
        char x = 'd';
        int count = 0;
        int n = arr.length;

        for (char c : arr) {
            if (c == x) {
                count++;
            }
        }
        System.out.println(count);
    }
}
