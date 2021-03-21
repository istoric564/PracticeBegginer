package Day12;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 * из списка. Распечатать список.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Toyota", "Honda", "BMW", "Scania", "Mercedes"));
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\n");
        list.remove(0);
        list.add(2,"JMC");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
