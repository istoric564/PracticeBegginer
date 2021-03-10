package Day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info(){
        System.out.println("Изготовитель " + producer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длина " + length);
        System.out.println("Вес: " + weight);
        System.out.println("Кол-во топлива в баке " + getFuel());
    }
    public void fillUp(int fuelUp){
        int fuel =  fuelUp;
        setFuel(fuelUp + fuel);
    }
}
