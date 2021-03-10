package Day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student studentName) {
        Random random = new Random();
        int i = random.nextInt(4) + 2;
        String evaluation = "";
        switch (i) {
            case 2:
                evaluation = "Неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
        System.out.println("Преподаватель: " + this.name + " оценил студента с именем " + studentName.getStudentName() + " по предмету " +
                this.subject + " на оценку " + evaluation);

    }
}

