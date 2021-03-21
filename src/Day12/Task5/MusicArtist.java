package Day12.Task5;

public class MusicArtist {
    private String firstName;
    private String secondName;
    private int age;

    public MusicArtist(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    public String getFullName(){
        return firstName + secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
