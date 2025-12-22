package Mentor.Lesson9.UnversitySys;

public class Main {
    static void main(String[] args) {
        Teacher teacher = new Teacher(12345, "Orxan Alizade");
        Student student = new Student(14522, "Mushvig Goja");

        teacher.getDetails();
        teacher.takeExam();
        teacher.receiveSalary();
        student.getDetails();
        student.takeExam();
    }

}
