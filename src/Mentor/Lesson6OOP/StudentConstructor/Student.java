package Mentor.Lesson6OOP.StudentConstructor;

public class Student {
    String name ;
    int age ;
    int schoolNumber ;

    public Student(String name, int age, int schoolNumber) {
        this.name = name;
        this.age = age;
        schoolNumber = schoolNumber;
    }

    public void showInfo (){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School Number: " + schoolNumber);
    }


}
