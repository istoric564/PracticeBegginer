package Lesson9.task1;
/*
1. Создать класс, описывающий промежуток времени.
   Сам промежуток времени должен задаваться тремя свойствами:
   секундами, минутами и часами.
   Создать метод для получения полного количества секунд в объекте
   Создать два конструктора: первый принимает общее количество
   секунд, второй - часы, минуты и секунды по отдельности.
   Создать метод для вывода данных.

 */
public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(60,2,0);
        System.out.println(timeInterval.totalSeconds());
        TimeInterval timeInterval1 = new TimeInterval(123124);
        System.out.println(timeInterval1.totalSeconds());
        timeInterval1.print();
        TimeInterval sumIntervals = timeInterval.sum(timeInterval1);
        sumIntervals.print();
    }
}
