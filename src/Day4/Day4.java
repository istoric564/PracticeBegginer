package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        one();
    }
    public static void one() {
        int arraySize;
        int i0 = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        Random random = new Random(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        arraySize = scanner.nextInt();
        System.out.println("Введено число: " + arraySize);
        System.out.println("Сгенерирован следующий массив:");
        int[] array = new int[arraySize];
        System.out.println("Длина массива: " + array.length);
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        for (int element : array) {
            if (element >= 8) {
                i0++;
            }
        }
        System.out.println("Кол-во элементов больше 8: " + i0);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                i1++;
            }
        }
        System.out.println("Кол-во элементов равных 0: " + i1);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                i2++;
            }
        }
        System.out.println("Кол-во четных элементов: " + i2);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] != 0) {
                i3++;
            }
        }
        System.out.println("Кол-во нечетных элементов: " + i3);
        for (int i = 0; i < array.length;i++) {
            i4 = i4 + array[i];
        }
        System.out.println("Сумма всех элементов : " + i4);

    }

}
