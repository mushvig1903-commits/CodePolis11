package Main.lesson6.EWallet;

public class User {
    private String name;
    private String surname;
    private String password;
    private EWallet wallet;

    public User(String name, String surname, String password){
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.wallet = new EWallet(); // hər istifadəçinin öz pulqabısı olur

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public EWallet getWallet() {
        return wallet;
    }

    public void setWallet(EWallet wallet) {
        this.wallet = wallet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean checkPassword (String input){
        return this.password.equals(input);
    }
}
