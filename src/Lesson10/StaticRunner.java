package Lesson10;

import Lesson9.Computer;

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null,null);
        new Computer(null,null);
        new Computer(null,null);
        new Computer(null,null);
        Computer computer = new Computer(null, null);
        System.out.println(Computer.getCounter());
        Class<? extends Computer> clazz = computer.getClass();
    }
}
