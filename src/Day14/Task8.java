package Day14;

/**
 * Given the triangle of consecutive odd numbers:
 *
 *              1
 *           3     5
 *        7     9    11
 *    13    15    17    19
 * 21    23    25    27    29
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(5));
    }
    public static int rowSumOddNumbers(int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += n * n;
        }

        return s;
    }
}
