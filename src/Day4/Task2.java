package Day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }

        int max = 0;
        for (int element : array){
            if (element > max){
                max = element;
            }
        }
        System.out.println(max);

        int min = 10000;
        for (int element : array){
            if (element < min){
                min = element;
            }
        }
        System.out.println(min);

        int count = 0;
        for (int element : array){
            if (element % 10 == 0){
                count++;
            }
        }
        System.out.println(count);

        int sum = 0;
        for (int element : array){
            if (element % 10 == 0){
                sum += element;
            }
        }
        System.out.println(sum);
    }
}
