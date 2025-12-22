package Mentor.Lesson9.UnversitySys;

public class Teacher extends User implements ExamParticipant, Payable {
    public Teacher(int id, String name ){
        super(id, name);
    }

    public void getDetails(){
        System.out.println("Teacher ID: " + getId() + ", name: " + getName() );
    }

    @Override
    public void takeExam(){
        System.out.println(getName() + " is supervising the exam.");
    }
    public void receiveSalary(){
        System.out.println(getName() + " has received the salary.");
    }
}
