package Day14;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String str = "1234d";
        System.out.println(validatePin(str));

    }

    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            if (pin.matches("\\d{4}") || pin.matches("\\d{6}")) {
                return true;
            }
        }
        return false;
    }
}
