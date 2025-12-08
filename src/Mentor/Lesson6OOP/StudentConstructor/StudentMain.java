package Mentor.Lesson6OOP.StudentConstructor;

public class StudentMain {
    static void main(String[] args) {
        Student s1 = new Student("Mushvig", 32, 199);
        Student s2 = new Student("Elmar", 30, 189);

        s1.showInfo();
        System.out.println("________________");
        s2.showInfo();

    }
}
