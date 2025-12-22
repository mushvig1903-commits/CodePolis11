package Mentor.Lesson9.UnversitySys;

abstract class User {
    private String name;
    private int id;

    public User(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public abstract void getDetails();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}

