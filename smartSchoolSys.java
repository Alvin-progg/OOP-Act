
class Person {

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println(name);
    }
}

class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("I am " + name + ", a student.");
    }

    void sendMessage() {
        System.out.println("Message sent to teacher.");
    }

    void sendMessage(String msg) {
        System.out.println("Message sent to teacher: " + msg);
    }
}

class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("I am " + name + ", a teacher.");
    }

    void sendMessage() {
        System.out.println("Message sent to student.");
    }
}

public class smartSchoolSys {

    public static void main(String[] args) {
        Person p1 = new Student("name");
        Person p2 = new Teacher("Jazz");

        p1.showInfo();
        p2.showInfo();

        Student s1 = new Student("name");
        s1.sendMessage();
        s1.sendMessage("Can I submit my project tomorrow?");
    }
}
