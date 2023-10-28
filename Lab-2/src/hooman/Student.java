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
        System.out.println("Hi! I am " + getName() + " " + getAge() + " years old from " + grade + " grade.");
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + getName() + "| Age: " + getAge() + "| Grade: " + grade);
    }
}
