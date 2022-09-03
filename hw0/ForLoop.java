public class ForLoop {
    /** Returns the maximum value from m using a for loop. */
    public static int max(int[] m) {
        int len_array = m.length;
        int max_value = m[0];
        for (int i = 0; i < len_array; i++) {
            if (m[i] > max_value) {
                max_value = m[i];
            }
        }
        return max_value;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
        int max_value = max(numbers);
        System.out.println(max_value);
    }
}
