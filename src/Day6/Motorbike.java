package Day6;

public class Motorbike {
    private int yearOfPublic;
    private String color;
    private String model;

    public Motorbike(int yearOfPublic, String color, String model) {
        this.yearOfPublic = yearOfPublic;
        this.color = color;
        this.model = model;
    }

    public int getYearOfPublic() {
        return yearOfPublic;
    }

    public void setYearOfPublic(int yearOfPublic) {
        this.yearOfPublic = yearOfPublic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year){
        return year - yearOfPublic;
    }
}

