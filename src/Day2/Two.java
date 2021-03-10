package Day2;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа a, b ,f: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int f = scan.nextInt();
        System.out.println("Данное выражение вычисляем по формуле (а + b — f / а) + f * a * a — (a + b)");
        System.out.println("Результат: ");
        System.out.println((a + b - f / a) + f * a * a - (a+b));
    }
}
