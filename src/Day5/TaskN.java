package Day5;

public class TaskN {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike moto = new Motorbike(2005, "White", "Yamaha");
        car.setColor("Gray");
        car.setModel("Toyota");
        car.setYearOfPublic(1998);
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYearOfPublic());
        System.out.println(moto.getColor());
        System.out.println(moto.getModel());
        System.out.println(moto.getYearOfPublic());
    }
}
