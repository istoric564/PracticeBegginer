package Day14;

import java.util.Arrays;

/**
 * Given an array of integers.
 * <p>
 * Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
 * <p>
 * If the input array is empty or null, return an empty array.
 * <p>
 * Example
 * For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */
public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{};
        System.out.println(Arrays.toString(countPositivesSumNegatives(arr1)));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        if (input.length != 0) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    count++;
                } else if (input[i] < 0) {
                    sum += input[i];
                }
                //return an array with count of positives and sum of negatives
            }
            int[] arr = new int[]{count, sum};
            return arr;
        } else if (input == null) {
            return null;
        }else {
            return null;
        }
    }
}
