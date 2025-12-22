package Mentor.Lesson9.UnversitySys;

public class Student extends User implements ExamParticipant{
    public Student(int id, String name){
        super(id, name);
    }
    public void getDetails(){
        System.out.println("Student ID: " + getId() + ", name: " + getName());
    }

    @Override
    public void takeExam(){
        System.out.println(getName() + " is taking the exam.");
    }

}
