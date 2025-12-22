package Mentor.Lesson9.Person;

public class Employee extends Person implements Workable, Trainable {
    public Employee(String name, int age) {
        super(name, age);
    }
    @Override
    public void printInfo(){
        System.out.println("Ad: " + getName() + ", Yash: "  + getAge());
    }

    @Override
    public void work(){
        System.out.println( getName() +" Working");
    }
    @Override
    public void attendTraining(){
        System.out.println(getName() + " Training");
    }

}
