package Day14;

import java.util.Arrays;

/**
 * Issue
 * Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
 *
 * The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
 * Each pipe should be connecting, since the levels ascend,
 * you can assume every number in the sequence after the first index will be greater
 * than the previous and that there will be no duplicates.
 *
 * Task
 * Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.
 *
 * Example
 * Input: 1,3,5,6,7,8
 *
 * Output: 1,2,3,4,5,6,7,8
 */
public class Task9 {
    public static void main(String[] args) {
        int[] newArray1 = new int[]{-1,4};
        System.out.println(Arrays.toString(pipeFix(newArray1)));
    }
    public static int[] pipeFix(int[] numbers) {

//        Arrays.sort(numbers);
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        int[] newArray = new int[max - min + 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] += min;
                min++;
            }
        return newArray;
    }
}
