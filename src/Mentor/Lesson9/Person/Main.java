package Mentor.Lesson9.Person;

public class Main {
    static void main(String[] args) {
        Employee employee = new Employee("Akif", 31);
        Employee employee1 = new Employee("Elmar", 33);
        employee.printInfo();
        employee.attendTraining();
        employee1.printInfo();
        employee1.work();




    }

}
