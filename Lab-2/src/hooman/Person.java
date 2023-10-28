package hooman;

public class Person implements Printable {
    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150){
            System.out.println("Please enter valid information for age.");
        }else{
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            System.out.println("Please enter your name.");
        }else {
            this.name = name;
        }
    }

    public void introduce(){

        System.out.println("Hi! I am " + getName() + " " + getAge() + " years old.");

    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + getName() + "| Age: " + getAge());
    }
}
