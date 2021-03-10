package Day1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        System.out.println("Введите пятизначное число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Первая цифра равна: " + a / 10000);
        System.out.println("Вторая цифра равна: " + a % 10000 / 1000);
        System.out.println("Третья цифра равна: " + a % 10000 % 1000 / 100);
        System.out.println("Четвертая цифра равна: " + a % 10000 % 1000 % 100 / 10);
        System.out.println("Пятая цифра равна: " + a % 10000 % 1000 % 100 % 10);
    }
}
