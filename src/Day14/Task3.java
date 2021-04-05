package Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54}));

    }

    public static String findNeedle(Object[] haystack) {
        // Your code here
        String str = "needle";
        int i = Arrays.asList(haystack).indexOf(str);
        return "found the needle at position " + i;
    }
}
