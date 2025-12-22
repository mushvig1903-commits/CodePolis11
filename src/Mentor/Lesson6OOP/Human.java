package Mentor.Lesson6OOP;

public class Human {

    String name ;
    String surname ;
    int age ;
    double weight ;
    double height ;
    String eyeColor;


    public Human(String name, String surname, int age, double weight, double height, String eyeColor) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
    }


    void printInfo(){



    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
