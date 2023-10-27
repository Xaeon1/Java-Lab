package hooman;

import hooman.Person;
import hooman.Printable;

public class Student extends Person implements Printable {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.println(getName() + getAge() + grade);
    }

    @Override
    public void printDetails() {
        introduce();
    }
}
