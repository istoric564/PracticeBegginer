package Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int a = 4;
        Scanner scanner = new Scanner(System.in);
        while (count <= a){
            String str = scanner.nextLine();
            if(str.length() > 10){
                List<Character> list = new ArrayList<>();
                char[] strArray = str.toCharArray();
                for (int i = 0; i < str.length(); i++) {
                    list.add(strArray[i]);
                }
                System.out.println("List: " + list);
                System.out.print(list.get(0));
                System.out.print(list.size() - 2);
                System.out.print(list.get(list.size() - 1));
                count++;
            }else {
                System.out.println(str);
                count++;
            }
        }

    }
}
